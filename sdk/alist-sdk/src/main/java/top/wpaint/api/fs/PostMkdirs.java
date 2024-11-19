package top.wpaint.api.fs;

import com.alibaba.fastjson2.JSONObject;
import lombok.NonNull;
import lombok.Setter;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import top.wpaint.api.API;

import java.util.HashMap;
import java.util.Map;

@Setter
public class PostMkdirs extends API {

    @NonNull
    private String path;

    public PostMkdirs(@NotNull String path, @NotNull String token) {
        super();
        this.path = path;
        super.token = token;
        super.uri = "/api/fs/mkdir";
    }

    @Override
    public Request request() {
        return toPostRequest(new HashMap<>(Map.of("path", path)));
    }
}