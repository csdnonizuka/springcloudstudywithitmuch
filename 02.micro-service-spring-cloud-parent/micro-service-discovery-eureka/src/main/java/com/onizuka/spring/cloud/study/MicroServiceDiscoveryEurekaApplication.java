package com.onizuka.spring.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroServiceDiscoveryEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceDiscoveryEurekaApplication.class, args);
	}
}
