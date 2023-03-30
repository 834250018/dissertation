package cn.ve.user.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author ve
 * @date 2021/8/10
 */
@Data
@Accessors(chain = true)
public class LoginByPasswordDTO implements Serializable {

    private static final long serialVersionUID = -6404614977048240355L;
    /**
     * 编号
     */
    private Long id;
    /**
     * 访问令牌
     */
    private String accessToken;  
    /**
     * 刷新令牌
     */
    private String refreshToken;  
    /**
     * 用户编号
     */
    private Long userId;
    /**
     * 用户类型
     */
    private Long userType;
    /**
     * 客户端编号
     */
    private String clientId; 
    /**
     * 过期时间
     */
    private Long expiresTime;

}
