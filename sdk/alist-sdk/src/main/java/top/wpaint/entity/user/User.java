package top.wpaint.entity.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    // id
    private Integer id;

    // 用户名
    private String username;

    // 密码
    private String password;

    // 基本路径
    private String basePath;

    // 用户权限类型
    private Integer role;

    // 是否禁用
    private Boolean disabled;

    // 用户操作权限
    private Integer permission;

    // SSO_ID [用于搜索引擎爬虫]
    private String ssoId;

    // 是否启用两步验证 2FA
    private Boolean otp;
}