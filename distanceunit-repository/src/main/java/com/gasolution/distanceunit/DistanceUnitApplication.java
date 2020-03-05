package com.gasolution.distanceunit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DistanceUnitApplication {

	public static void main(String[] args) {
		SpringApplication.run(DistanceUnitApplication.class, args);
	}

}
