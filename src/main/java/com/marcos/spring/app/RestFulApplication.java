package com.marcos.spring.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class RestFulApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestFulApplication.class, args);
	}

}
