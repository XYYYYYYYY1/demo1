package top.wpaint.entity.fs;

import lombok.Getter;
import lombok.NonNull;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public record RenameObj(@NonNull String srcName, @NonNull String newName) {
    public RenameObj(@NotNull String srcName, @NotNull String newName) {
        this.srcName = srcName;
        this.newName = newName;
    }
}

class RenameObjListBuilder {

    private final ArrayList<RenameObj> list = new ArrayList<>();

    public RenameObjListBuilder add(@NotNull String srcName, @NotNull String newName) {
        list.add(new RenameObj(srcName, newName));
        return this;
    }

    public ArrayList<RenameObj> build() {
        return list;
    }
}