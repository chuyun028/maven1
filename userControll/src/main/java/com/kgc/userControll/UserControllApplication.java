package com.kgc.userControll;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.kgc.userControll.dao")
public class UserControllApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserControllApplication.class, args);
	}

}
