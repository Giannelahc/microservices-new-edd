package com.ms.v2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class OrderServiceV2Application {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceV2Application.class, args);
	}

}
