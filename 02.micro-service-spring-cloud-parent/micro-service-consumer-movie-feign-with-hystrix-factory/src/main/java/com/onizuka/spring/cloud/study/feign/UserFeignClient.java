package com.onizuka.spring.cloud.study.feign;

import com.onizuka.spring.cloud.study.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "micro-service-provider-user", /*fallback = HystrixClientFallback.class,*/ fallbackFactory = HystrixClientFactory.class)
public interface UserFeignClient {
    @RequestMapping(value = "/simple/{id}", method = RequestMethod.GET)
    public User findById(@PathVariable("id") Long id);
}

