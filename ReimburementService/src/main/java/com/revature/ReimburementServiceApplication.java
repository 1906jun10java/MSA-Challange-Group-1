package com.revature;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;


@SpringBootApplication
@EnableEurekaClient
public class ReimburementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReimburementServiceApplication.class, args);
	}

}
