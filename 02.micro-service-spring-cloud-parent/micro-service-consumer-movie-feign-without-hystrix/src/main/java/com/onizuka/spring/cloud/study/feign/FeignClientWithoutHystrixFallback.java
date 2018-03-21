package com.onizuka.spring.cloud.study.feign;

import org.springframework.stereotype.Component;

@Component
public class FeignClientWithoutHystrixFallback implements FeignClientWithoutHystrix {

    @Override
    public String findServiceInfoFromEurekaByServiceName(String serviceName) {
        return "haha";
    }
}
