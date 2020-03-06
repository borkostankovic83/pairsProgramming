package com.revature.cognizant.aggregatedService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AggregatedServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AggregatedServiceApplication.class, args);
	}

}
