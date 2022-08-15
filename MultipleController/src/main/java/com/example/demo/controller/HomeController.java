package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	@GetMapping("/getHome")   //http://localhost:8080/home/getHome
	public String home() {
		System.out.println("Inside Home");
		return "/home.jsp";
	}
	
	@GetMapping("/getForm")   //http://localhost:8080/home/getForm
	public String getForm() {
		System.out.println("getForm Home");
		return "/form.jsp";
	}

}
