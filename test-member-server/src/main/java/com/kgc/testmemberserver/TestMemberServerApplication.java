package com.kgc.testmemberserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class TestMemberServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestMemberServerApplication.class, args);
	}

}
