package com.onizuka.spring.cloud.study.controller;

import com.onizuka.spring.cloud.study.entity.User;
import com.onizuka.spring.cloud.study.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;
    @GetMapping("/simple/{id}")
    public User findById(@PathVariable Long id) {
        return userRepository.findOne(id);
    }
}
