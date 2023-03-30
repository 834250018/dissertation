package cn.ve.user.param;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * 登陆表(UserLogin)实体类
 *
 * @author makejava
 * @since 2021-09-20 13:15:25
 */
@Data
public class LoginByPasswordForm implements Serializable {

    private static final long serialVersionUID = -4067763542516504648L;
    /**
     * 图片验证码
     */
    @NotBlank
    private String captchaVerification;
    /**
     * 账号
     */
    @NotBlank private String username;
    /**
     * 密码
     */
    @NotBlank private String password;

}
