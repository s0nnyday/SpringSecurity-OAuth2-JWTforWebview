package com.example.securityoauthjwtwebview.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsMvcConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry corsRegistry) {

        corsRegistry.addMapping("/**")
                .exposedHeaders("Set-Cookie") // 노출할 헤더값
                .allowedOrigins("http://localhost:8000"); // 프론트 서버 React 같은 웹,앱이 동작할 서버 주소
    }
}