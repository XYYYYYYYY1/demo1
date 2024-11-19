package top.wpaint.config;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BaseConfig {
    // API 服务器地址
    // eg: http://127.0.0.1:5244
    private String serverName;

}