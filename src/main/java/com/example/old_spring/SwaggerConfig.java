package com.example.old_spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .build()
                ;
    }

    @Bean
    ApiInfo apiInfo() {
        return new ApiInfo(
                "Swagger REST API для тестового задания",
                "Тестовое задание",
                "1.0",
                null, null, null, null
        );
    }
}

