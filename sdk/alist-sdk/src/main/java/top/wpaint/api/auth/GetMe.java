package top.wpaint.api.auth;

import lombok.Getter;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import top.wpaint.api.API;

@Getter
public class GetMe extends API {

    public GetMe(@NotNull String token) {
        super();
        super.token = token;
        super.uri = "/api/me";
    }

    @Override
    public Request request() {
        return toGetRequest();
    }
}