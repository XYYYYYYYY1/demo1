package com.shadow.fifshadow;

import cn.dev33.satoken.SaTokenManager;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SaTokenDemoApplication {
    public static void main(String[] args) throws JsonProcessingException {
        SpringApplication.run(SaTokenDemoApplication.class, args);
        System.out.println("启动成功：sa-token配置如下：" + SaTokenManager.getConfig());
    }
}
