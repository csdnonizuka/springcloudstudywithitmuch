package com.onizuka.spring.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class MicroServiceConsumerMovieFeignCustomizingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceConsumerMovieFeignCustomizingApplication.class, args);
	}
}
