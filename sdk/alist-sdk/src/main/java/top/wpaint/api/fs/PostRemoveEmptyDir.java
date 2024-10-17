package top.wpaint.api.fs;

import lombok.NonNull;
import lombok.Setter;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import top.wpaint.api.API;

import java.util.HashMap;
import java.util.Map;

@Setter
public class PostRemoveEmptyDir extends API {
    @NonNull
    private String srcDir;

    public PostRemoveEmptyDir(@NotNull String srcDir, @NotNull String token) {
        super();
        this.srcDir = srcDir;
        super.token = token;
        super.uri = "/api/fs/remove_empty_directory";
    }

    @Override
    public Request request() {
        return toPostRequest(new HashMap<>(Map.of("src_dir", srcDir)));
    }
}