package com.bridgelabz.hello1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Hello1Application {

	public static void main(String[] args) {
		System.out.println("hello from bridgelabz");
		SpringApplication.run(Hello1Application.class, args);
	}

}
