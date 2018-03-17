package com.onizuka.spring.cloud.study.feign;

import com.onizuka.spring.cloud.config.FeignConfig;
import com.onizuka.spring.cloud.study.entity.User;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "micro-service-provider-user", configuration = FeignConfig.class)
public interface UserFeignClient {
    @RequestLine("GET /simple/{id}")
    User findById(@Param("id") Long id);
}
