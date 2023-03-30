package cn.ve.user.dal.entity;

import cn.ve.base.pojo.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import lombok.experimental.FieldNameConstants;

/**
 * 用户表(UserLoginRelation)实体类
 *
 * @author ve
 * @since 2022-02-22 14:16:51
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@FieldNameConstants
public class UserLoginRelation extends BaseEntity {
    private static final long serialVersionUID = -80291923820424731L;

    /**
     * 创建人名称
     */
    private String creatorName;

    /**
     * 修改人名称
     */
    private String updaterName;
    /**
     * 用户id
     */
    private Long userId;

    /**
     * 用户类型:0.管理员；1.教师;2.学生;
     */
    private Integer userType;

    /**
     * 登录类型:0->微信登陆;1->手机号登录;2->账号密码登录;
     */
    private Integer loginType;

    /**
     * 账号或手机号或第三方openid
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 盐
     */
    private String salt;

}
