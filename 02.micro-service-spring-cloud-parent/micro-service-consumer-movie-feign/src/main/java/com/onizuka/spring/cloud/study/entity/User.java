package com.onizuka.spring.cloud.study.entity;

import lombok.*;

import java.math.BigDecimal;

@Data
public class User {
    private Long id;
    private String username;
    private String name;
    private Short age;
    private BigDecimal balance;
}
