package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MultipleControllerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultipleControllerApplication.class, args);
		System.out.println("Running");
	}

}