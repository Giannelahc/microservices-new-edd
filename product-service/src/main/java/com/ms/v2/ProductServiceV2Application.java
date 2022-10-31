package com.ms.v2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ProductServiceV2Application {

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceV2Application.class, args);
	}

}
