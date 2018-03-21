package com.onizuka.spring.cloud.study.feign;

import com.onizuka.spring.cloud.config.FeignConfig2;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "xxxx", url = "http://localhost:8761/", configuration = FeignConfig2.class, fallback = FeignClientWithoutHystrixFallback.class)
public interface FeignClientWithoutHystrix {
    @RequestMapping(value = "/eureka/apps/{serviceName}")
    public String findServiceInfoFromEurekaByServiceName(@PathVariable("serviceName") String serviceName);
}
