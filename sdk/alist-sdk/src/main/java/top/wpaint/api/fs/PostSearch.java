package top.wpaint.api.fs;

import lombok.NonNull;
import lombok.Setter;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import top.wpaint.api.API;

@Setter
public class PostSearch extends API {
    private String parent;
    private String keywords;
    private String password;
    private Integer scope;
    private Integer page;
    private Integer perPage;

    public PostSearch(@NotNull String token) {
        super();
        super.token = token;
        super.uri = "/api/fs/search";
    }

    @Override
    public Request request() {
        // TODO Body 完善
        return toPostRequest( null);
    }
}