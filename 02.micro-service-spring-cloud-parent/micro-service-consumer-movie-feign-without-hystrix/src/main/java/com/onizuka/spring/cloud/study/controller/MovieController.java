package com.onizuka.spring.cloud.study.controller;

import com.onizuka.spring.cloud.study.entity.User;
import com.onizuka.spring.cloud.study.feign.FeignClientWithoutHystrix;
import com.onizuka.spring.cloud.study.feign.FeignClientWithHystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @Autowired
    private FeignClientWithHystrix feignClientWithHystrix;
    @Autowired
    private FeignClientWithoutHystrix feignClientWithoutHystrix;

    @GetMapping("/movie/{id}")
    public User findById(@PathVariable Long id) {
        return feignClientWithHystrix.findById(id);
    }

    @GetMapping("/{serviceName}")
    public String findServiceInfoFromEurekaByServiceName(@PathVariable String serviceName) {
        return this.feignClientWithoutHystrix.findServiceInfoFromEurekaByServiceName(serviceName);
    }
}
