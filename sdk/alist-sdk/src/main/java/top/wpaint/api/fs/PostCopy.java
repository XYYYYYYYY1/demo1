package top.wpaint.api.fs;

import lombok.NonNull;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import top.wpaint.api.API;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PostCopy extends API {

    @NonNull
    private String srcDir;

    @NonNull
    private String dstDir;

    @NonNull
    private ArrayList<String> names;

    public PostCopy(@NotNull String srcDir, @NotNull String dstDir, @NotNull ArrayList<String>names, @NotNull String token) {
        this.srcDir = srcDir;
        this.dstDir = dstDir;
        this.names = names;
        super.token = token;
        super.uri = "/api/fs/copy";
    }

    @Override
    public Request request() {
        return toPostRequest(new HashMap<>(Map.of("src_dir", srcDir, "dst_dir", dstDir, "names", names)));
    }
}