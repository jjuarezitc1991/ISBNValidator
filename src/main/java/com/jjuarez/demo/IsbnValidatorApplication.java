package com.jjuarez.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.jjuarez")
public class IsbnValidatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(IsbnValidatorApplication.class, args);
	}
}
