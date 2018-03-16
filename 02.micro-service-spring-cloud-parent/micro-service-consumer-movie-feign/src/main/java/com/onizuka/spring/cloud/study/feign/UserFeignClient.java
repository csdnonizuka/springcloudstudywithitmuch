package com.onizuka.spring.cloud.study.feign;

import com.onizuka.spring.cloud.study.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("micro-service-provider-user")
public interface UserFeignClient {
    @RequestMapping(value = "/simple/{id}", method = RequestMethod.GET)
    User findById(@PathVariable("id") Long id);
}
