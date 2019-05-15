package com.cx.manageclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties
@SpringBootApplication
public class ManageClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManageClientApplication.class, args);
	}

}
