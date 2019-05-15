package com.kgc.testusersserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableEurekaClient
@SpringBootApplication
public class TestUsersServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestUsersServerApplication.class, args);
	}

	
//	@Bean
//    @LoadBalanced
//    RestOperations restTemplate(RestTemplateBuilder builder) {
//        return builder.build();
//    }

    
    
	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
