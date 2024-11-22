package top.wpaint.api.fs;

import lombok.NonNull;
import lombok.Setter;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import top.wpaint.api.API;
import top.wpaint.entity.fs.RenameObj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Setter
public class PostRgxRename extends API {

    @NonNull
    private String srcDir;

    @NonNull
    private ArrayList<RenameObj> renameObjects;

    public PostRgxRename(@NotNull String srcDir, @NotNull ArrayList<RenameObj> renameObjects, @NotNull String token) {
        super();
        this.srcDir = srcDir;
        this.renameObjects = renameObjects;
        super.token = token;
        super.uri = "/api/fs/regex_rename";
    }

    @Override
    public Request request() {
        return toPostRequest(new HashMap<>(Map.of("src_dir", srcDir, "rename_objects", renameObjects)));
    }

}