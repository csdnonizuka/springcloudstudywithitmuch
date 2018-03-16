package com.onizuka.spring.cloud.study.entity;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class User {
    private Long id;
    private String username;
    private String name;
    private Short age;
    private BigDecimal balance;
}
