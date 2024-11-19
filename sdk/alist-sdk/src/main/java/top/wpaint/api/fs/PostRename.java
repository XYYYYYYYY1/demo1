package top.wpaint.api.fs;

import lombok.NonNull;
import lombok.Setter;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import top.wpaint.api.API;

import java.util.HashMap;
import java.util.Map;

@Setter
public class PostRename extends API {
    @NonNull
    private String name;

    @NonNull
    private String path;

    public PostRename(@NotNull String name, @NotNull String path, @NotNull String token) {
        super();
        this.name = name;
        this.path = path;
        super.token = token;
        super.uri = "/api/fs/rename";
    }

    @Override
    public Request request() {
        return toPostRequest(new HashMap<>(Map.of("name", name, "path", path)));
    }
}