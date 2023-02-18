package com.hth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.hth.mapper")
@EnableScheduling
@EnableSwagger2
public class THBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(THBlogApplication.class);
    }
}
