package com.onizuka.spring.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
public class MicroServiceHystrixTurbineApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceHystrixTurbineApplication.class, args);
	}
}
