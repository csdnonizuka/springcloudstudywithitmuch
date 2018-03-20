package com.onizuka.spring.cloud.study.feign;

import com.onizuka.spring.cloud.study.entity.User;

public class HystrixClientFallback implements UserFeignClient {
    @Override
    public User findById(Long id) {
        return null;
    }
}
