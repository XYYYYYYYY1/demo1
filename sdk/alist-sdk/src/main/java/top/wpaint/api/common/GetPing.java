package top.wpaint.api.common;

import okhttp3.Request;
import top.wpaint.api.API;

public class GetPing extends API {
    public GetPing() {
        super();
        super.uri = "/ping";
    }

    @Override
    public Request request() {
        return toGetRequest();
    }
}