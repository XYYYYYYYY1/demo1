package top.wpaint.api;

import com.alibaba.fastjson2.JSONObject;
import lombok.*;
import okhttp3.*;
import org.jetbrains.annotations.NotNull;
import top.wpaint.common.HttpContentType;
import top.wpaint.config.BaseConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class API {

    @NonNull
    private BaseConfig config;

    @NonNull
    protected String uri;

    protected String token;

    /**
     * 发起一个 http 请求，通用形式
     */
    public Request request(@NotNull String method, HashMap<String, String> params, HashMap<String, String> headers, RequestBody body) {
        // 构造 http
        HttpUrl.Builder httpUrlBuilder = Objects.requireNonNull(HttpUrl.parse(config.getServerName() + uri)).newBuilder();

        // 添加 Param 参数
        Optional.ofNullable(params).orElse(new HashMap<>()).forEach(httpUrlBuilder::addQueryParameter);

        if (null == headers) {
            headers = new HashMap<>();
        }

        if (null != token && !headers.containsKey("Authorization")) {
            headers.put("Authorization", token);
        }

        // 添加 Header 参数
        Headers headerPairs = Headers.of(headers);

        return new Request.Builder()
                .url(httpUrlBuilder.build())
                .headers(headerPairs)
                .method(method, body)
                .build();
    }

    /**
     * 生成 GET 请求
     */
    public Request toGetRequest(HashMap<String, String> params, HashMap<String, String> headers) {
        return request("GET", params, headers, null);
    }

    /**
     * 传入 Auth(Token) 请求头，带有参数
     */
    public Request toGetRequest(HashMap<String, String> params) {
        return toGetRequest(params, null);
    }

    /**
     * 仅有 API，无需任何参数的请求
     */
    public Request toGetRequest() {
        return request("GET", null, null, null);
    }

    /**
     * 生成 POST 请求，考虑到 POST 请求带有 param 的情况较少（AList没有），且一般近带有 String 形式的 Body 和 Token
     */
    public Request toPostRequest(HashMap<String, String> headers, HashMap<String, Object> json) {
        json = Optional.ofNullable(json).orElse(new HashMap<>());
        headers = Optional.ofNullable(headers).orElse(new HashMap<>());

        return request(
                "POST",
                null,
                headers,
                RequestBody.create(JSONObject.toJSONString(json), MediaType.parse(HttpContentType.JSON))
        );
    }

    public Request toPostRequest(HashMap<String, Object> json) {
        return toPostRequest(null, json);
    }

    /**
     * TODO 生成 PUT 请求
     */
    public Request toPutRequest() {
        throw new RuntimeException("unImplements!");
    }

    /**
     * 没有形参的请求，在BaseAPI中不允许，无参形式必须由子类提供
     */
    public Request request() {
        throw new RuntimeException("unImplements!");
    }
}