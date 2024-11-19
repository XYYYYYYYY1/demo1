package top.wpaint.api.auth;

import com.alibaba.fastjson2.JSONObject;
import lombok.Setter;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import top.wpaint.api.API;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.MessageDigestSpi;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


@Setter
public class PostTokenHash extends API {
    @NotNull
    private String username;

    @NotNull
    private String password;

    public PostTokenHash(@NotNull String username, @NotNull String password) {
        super();
        this.username = username;
        this.password = password;
        super.uri = "/api/auth/login/hash";
    }

    @Override
    public Request request() {
        // 特殊处理， AList 接口要求
        // 获取某个用户的临时JWt token，传入的密码需要在添加-https://github.com/alist-org/alist后缀后再进行sha256
        password = password + "-https://github.com/alist-org/alist";
        throw new RuntimeException("unImplements!");
//        return toPostRequest(JSONObject.toJSONString(new HashMap<>(Map.of("username", username, "password", password))));
    }
}