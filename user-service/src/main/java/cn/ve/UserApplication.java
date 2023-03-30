package cn.ve;

import cn.hutool.core.codec.Base64Encoder;
import cn.hutool.core.text.CharSequenceUtil;
import cn.ve.base.util.IdUtil;
import cn.ve.base.util.PasswordUtils;
import cn.ve.user.dal.entity.UserLoginRelation;
import cn.ve.user.dal.entity.UserUser;
import cn.ve.user.dal.mapper.UserLoginRelationMapper;
import cn.ve.user.dal.mapper.UserUserMapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

@Slf4j
@MapperScan({"cn.ve.user.dal.mapper"})
@EnableFeignClients
@SpringBootApplication
//@EnableDiscoveryClient // 开启注册发现
@EnableTransactionManagement // 开启事务
public class UserApplication implements CommandLineRunner {
    @Resource
    private UserLoginRelationMapper userLoginRelationMapper;
    @Resource
    private UserUserMapper userUserMapper;

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    @Override
    public void run(String... args) throws Exception {
        log.error("user_test:user_test-user_test");
        // 测试数据库
        checkAdminExists("admin");
        // 测试redis
        redisTemplate.opsForValue().set("1", "2");
    }

    private void checkAdminExists(String username) throws Exception {
        UserLoginRelation userLoginRelationDb = userLoginRelationMapper.selectOne(
                new LambdaQueryWrapper<UserLoginRelation>()
                        .eq(UserLoginRelation::getUsername, username)
                        .eq(UserLoginRelation::getUserType, 0)
                        .eq(UserLoginRelation::getLoginType, 2)
        );
        if (userLoginRelationDb != null) {
            return;
        }
        // 前端摘要
        byte[] bytes = "admin123".getBytes(StandardCharsets.UTF_8);
        byte[] digest = MessageDigest.getInstance("SHA-256").digest(bytes);
        String encryptedPwd = Base64Encoder.encode(digest);
        // 后端摘要
        String salt = IdUtil.genUUID();
        System.out.println("salt" + salt);
        System.out.println("encryptedPwd" + encryptedPwd);
        String pwd = PasswordUtils.genPwdCiphertext(encryptedPwd, salt);
        System.out.println(pwd);
        // 创建管理员数据
        UserUser user = new UserUser();
        user.setNickname("init");
        user.setPhone(CharSequenceUtil.EMPTY);
        user.setHeadPortrait(CharSequenceUtil.EMPTY);
        user.setGender(0);
        user.setProvinceCode(CharSequenceUtil.EMPTY);
        user.setCityCode(CharSequenceUtil.EMPTY);
        user.setAreaCode(CharSequenceUtil.EMPTY);
        user.setProvinceName(CharSequenceUtil.EMPTY);
        user.setCityName(CharSequenceUtil.EMPTY);
        user.setAreaName(CharSequenceUtil.EMPTY);
        user.setAddress(CharSequenceUtil.EMPTY);
        user.setBirthday(System.currentTimeMillis());
        user.setOccupation(CharSequenceUtil.EMPTY);
        user.setNickname(CharSequenceUtil.EMPTY);
        user.setNation(CharSequenceUtil.EMPTY);
        user.setHometown(CharSequenceUtil.EMPTY);
        user.setAge(0);

        userUserMapper.insert(user);
        // 创建登录数据
        UserLoginRelation userLoginRelation = new UserLoginRelation();
        userLoginRelation.setUserId(user.getId());
        userLoginRelation.setUserType(0);
        userLoginRelation.setLoginType(2);
        userLoginRelation.setUsername(username);
        userLoginRelation.setPassword(pwd);
        userLoginRelation.setSalt(salt);
        userLoginRelationMapper.insert(userLoginRelation);
        System.out.println("110");
    }

}
