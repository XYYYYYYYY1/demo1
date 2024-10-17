package com.shadow.fifshadow;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class FifShadowApplication {

    public static void main(String[] args) {
        SpringApplication.run(FifShadowApplication.class, args);
        log.info("FFiSystem 开始启动...");
    }

}
