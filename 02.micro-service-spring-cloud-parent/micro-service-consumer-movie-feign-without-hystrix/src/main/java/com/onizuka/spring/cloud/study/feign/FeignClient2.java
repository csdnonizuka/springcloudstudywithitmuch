package com.onizuka.spring.cloud.study.feign;

import com.onizuka.spring.cloud.config.FeignConfig;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "xxx", url = "http://localhost:8761/", configuration = FeignConfig.class, fallback = FeignClient2Fallback.class)
public interface FeignClient2 {
    @RequestMapping(value = "/eureka/apps/{serviceName}")
    public String findServiceInfoFromEurekaByServiceName(@PathVariable("serviceName") String serviceName);
}
