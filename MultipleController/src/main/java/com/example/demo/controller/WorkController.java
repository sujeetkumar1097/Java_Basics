package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/work")
public class WorkController {
	
	@GetMapping("/getWork")    //http://localhost:8080/work/getWork
	public String getWork() {
		System.out.println("Inside Work");
		return "/work.jsp";
	}

}
