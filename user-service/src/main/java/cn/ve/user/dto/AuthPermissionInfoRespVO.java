package cn.ve.user.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Accessors(chain = true)
public class AuthPermissionInfoRespVO {

    /**
     * 用户信息
     */
    private UserVO user;

    /**
     * 角色标识数组
     */
    private Set<String> roles;

    /**
     * 操作权限数组
     */
    private Set<String> permissions;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @Accessors(chain = true)
    public static class UserVO {

        /**
         * 用户编号
         */
        private Long id;

        /**
         * 用户昵称
         */
        private String nickname;

        /**
         * 用户头像
         */
        private String avatar;

    }

}
