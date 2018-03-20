package com.onizuka.spring.cloud.config;

import feign.Contract;
import feign.Logger;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {
    @Bean
    public Contract feignContract() {
        return new feign.Contract.Default();
    }

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
