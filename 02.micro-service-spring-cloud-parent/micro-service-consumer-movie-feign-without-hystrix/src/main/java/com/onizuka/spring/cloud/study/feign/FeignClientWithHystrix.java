package com.onizuka.spring.cloud.study.feign;

import com.onizuka.spring.cloud.config.FeignConfig1;
import com.onizuka.spring.cloud.study.entity.User;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(name = "micro-service-provider-user", configuration = FeignConfig1.class, fallback = FeignClientWithHystrixFallback.class)
public interface FeignClientWithHystrix {
    @RequestLine("GET /simple/{id}")
    User findById(@Param("id") Long id);
}
