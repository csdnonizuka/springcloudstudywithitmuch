package com.onizuka.spring.cloud.study.feign;

import com.onizuka.spring.cloud.study.entity.User;
import org.springframework.stereotype.Component;

@Component
public class FeignClientWithHystrixFallback implements FeignClientWithHystrix {
    @Override
    public User findById(Long id) {
        User user  = new User();
        user.setId(0L);
        return user;
    }
}
