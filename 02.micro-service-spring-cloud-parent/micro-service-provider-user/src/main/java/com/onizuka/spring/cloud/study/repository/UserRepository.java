package com.onizuka.spring.cloud.study.repository;

import com.onizuka.spring.cloud.study.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
