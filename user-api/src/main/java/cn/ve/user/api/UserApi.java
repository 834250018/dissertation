package cn.ve.user.api;

import cn.ve.feign.config.FeignConfiguration;
import cn.ve.feign.pojo.CommonResult;
import cn.ve.user.dto.LoginSession;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "user", configuration = FeignConfiguration.class)
public interface UserApi {

    @PostMapping("/feign/test")
    CommonResult<Boolean> test();

    @PostMapping("/feign/loginStatus")
    CommonResult<LoginSession> loginStatus();

}
