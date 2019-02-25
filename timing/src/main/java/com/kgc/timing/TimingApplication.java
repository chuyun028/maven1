package com.kgc.timing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling	//开启定时器devtool
public class TimingApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimingApplication.class, args);
	}

}
