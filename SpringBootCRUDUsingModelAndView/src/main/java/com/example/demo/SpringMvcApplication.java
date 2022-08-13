package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Scope;

import com.example.demo.pojo.Laptop;


@SpringBootApplication
public class SpringMvcApplication {

	public static void main(String[] args) {
		//It is used to initialize the spring container.
		//Component Scan take place and object creation take place for all class marked as @Component in spring container.
		ConfigurableApplicationContext context = SpringApplication.run(SpringMvcApplication.class, args);
		
		//getBean() is used to get the bean object from the spring container
		//ByDefault spring-boot is singleton scope.
		//To change scope type use @Scope("prototype") at Component level.
		Laptop lap1 = context.getBean(Laptop.class);
		//lap1.print();
		
		Laptop lap2 = context.getBean(Laptop.class);
		
		System.out.println("HI");
	}

}
