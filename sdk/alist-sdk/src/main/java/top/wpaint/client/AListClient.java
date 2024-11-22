package top.wpaint.client;

import lombok.*;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import top.wpaint.api.API;
import top.wpaint.config.BaseConfig;

import java.util.Optional;

@Data
public class AListClient {

    // 配置
    private BaseConfig config;

    // 请求
    @Getter(AccessLevel.NONE)
    private API api;

    public AListClient(@NotNull BaseConfig config, API api) {
        this.config = config;
        this.api = api;

        // 如果API不为空则为 API 注入 config
        inConfig();
    }

    public AListClient(@NotNull BaseConfig config) {
        this(config, null);
    }

    // 为 API 注入 config
    protected void inConfig() {
        if (null != api) {
            api.setConfig(config);
        }
    }

    public Request request(API api) {
        inConfig();
        return Optional.ofNullable(api).orElseGet(this::getApi).request();
    }

    public Request request() {
        return request(null);
    }

    public API getApi() {
        inConfig();
        return api;
    }
}
