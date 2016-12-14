package com.dade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringDataJpaSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaSampleApplication.class, args);
	}
}
