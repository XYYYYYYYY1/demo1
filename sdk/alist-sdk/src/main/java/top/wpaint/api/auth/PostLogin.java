package top.wpaint.api.auth;

import com.alibaba.fastjson2.JSONObject;
import lombok.Setter;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import top.wpaint.api.API;

import java.util.HashMap;
import java.util.Map;

@Setter
public class PostLogin extends API {
    @NotNull
    private String username;

    @NotNull
    private String password;

    public PostLogin(@NotNull String username, @NotNull String password) {
        super();
        this.username = username;
        this.password = password;
        super.uri = "/api/auth/login";
    }

    @Override
    public Request request() {
        return toPostRequest(new HashMap<>(Map.of("username", username, "password", password)));
    }
}