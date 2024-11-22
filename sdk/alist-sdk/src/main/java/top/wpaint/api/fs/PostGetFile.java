package top.wpaint.api.fs;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import top.wpaint.api.API;

@Setter
public class PostGetFile extends API {
    private String path;
    private String password;
    private Integer page;
    private Integer perPage;
    private Boolean refresh;

    public PostGetFile(@NotNull String token) {
        super();
        super.token = token;
        super.uri = "/api/fs/get";
    }

    @Override
    public Request request() {
        // TODO Body 完善
        return toPostRequest( null);
    }
}