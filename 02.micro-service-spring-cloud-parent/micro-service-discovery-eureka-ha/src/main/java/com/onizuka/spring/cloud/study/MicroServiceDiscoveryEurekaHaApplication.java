package com.onizuka.spring.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroServiceDiscoveryEurekaHaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceDiscoveryEurekaHaApplication.class, args);
	}
}
