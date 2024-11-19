package top.wpaint.api.common;

import okhttp3.Request;
import top.wpaint.api.API;

public class GetSettings extends API {
    public GetSettings() {
        super();
        this.uri = "/api/public/settings";
    }

    @Override
    public Request request() {
        return toGetRequest();
    }
}