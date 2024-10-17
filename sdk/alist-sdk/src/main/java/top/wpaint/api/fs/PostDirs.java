package top.wpaint.api.fs;

import lombok.NonNull;
import lombok.Setter;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import top.wpaint.api.API;

@Setter
public class PostDirs extends API {
    private String path;
    private String password;
    private Boolean forceRoot;

    public PostDirs(@NotNull String token) {
        super();
        super.token = token;
        super.uri = "/api/fs/dirs";
    }

    @Override
    public Request request() {
        // TODO Body 完善
        return toPostRequest(null);
    }
}