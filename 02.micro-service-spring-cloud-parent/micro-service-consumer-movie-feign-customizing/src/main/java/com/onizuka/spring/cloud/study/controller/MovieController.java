package com.onizuka.spring.cloud.study.controller;

import com.onizuka.spring.cloud.study.entity.User;
import com.onizuka.spring.cloud.study.feign.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @Autowired
    UserFeignClient userFeignClient;
    @GetMapping("/movie/{id}")
    public User findById(@PathVariable Long id) {
        return userFeignClient.findById(id);
    }
}
