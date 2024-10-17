package top.wpaint.api.fs;

import lombok.NonNull;
import lombok.Setter;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import top.wpaint.api.API;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Setter
public class PostRemove extends API {

    @NonNull
    private ArrayList<String> names;

    @NonNull
    private String dir;

    public PostRemove(@NotNull String dir, @NotNull ArrayList<String> names, @NotNull String token) {
        super();
        this.dir = dir;
        this.names = names;
        super.token = token;
        super.uri = "/api/fs/remove";
    }

    @Override
    public Request request() {
        return toPostRequest(new HashMap<>(Map.of("dir", dir, "names", names)));
    }
}