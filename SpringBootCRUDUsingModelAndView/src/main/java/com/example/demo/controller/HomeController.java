package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.pojo.Laptop;
import com.example.demo.service.ServiceLayer;


@Controller
//@ResponseBody  //@ResponseBody is used to return the content as response body
@RequestMapping("/")
public class HomeController {
	@Autowired
	private ServiceLayer serv;
	
	@GetMapping("home")
	public String home() {
		return "home";
	}
	
	@GetMapping("create")
	public String create() {
		return "create";
	}
	@GetMapping("create/createOne")
	public ModelAndView createOne(Laptop lap) {
		Laptop lap1 = serv.addLaptop(lap);
		System.out.println(lap1);
		ModelAndView mv = null;
		if(lap1 != null) {
			List<Laptop> laps = serv.getAllLaptops();
			mv = new ModelAndView("showAll");
			mv.addObject("laptops", laps);
		}else {
			mv = new ModelAndView("create");
			return mv;
		}
		return mv;
	}
	
	@GetMapping("create/updateOne")
	public ModelAndView updateOne(Laptop lap) {
		Laptop lap1 = serv.getLaptopById(lap.getLapId());
		System.out.println(lap1);
		lap1.setLapName(lap.getLapName());
		lap1.setColor(lap.getColor());
		System.out.println(lap1);
		List laptops = serv.updateLaptopById(lap.getLapId(), lap);
		ModelAndView mv = null;
		if (laptops.size() > 0) {
			mv = new ModelAndView("showAll");
			mv.addObject("laptops", laptops);
		}else {
			mv = new ModelAndView("create");
			return mv;
		}
		
		return mv;
	}
	
	@GetMapping("update/{id}")
	public ModelAndView update(@PathVariable("id") Integer lapId) {
		System.out.println("id is :" + lapId);
		Laptop lap = serv.getLaptopById(lapId);
		ModelAndView mv=null;
		if (lap != null) {
			mv = new ModelAndView("update");
			mv.addObject("laptop", lap);
		}
		return mv;
	}
	
	@GetMapping("delete/{id}")
	public ModelAndView delete(@PathVariable("id") Integer lapId) {
		System.out.println("id is :" + lapId);
		List laptops= serv.deleteLaptopById(lapId);
		ModelAndView mv = null;
		if (laptops.size() > 0) {
			mv = new ModelAndView("showAll");
			mv.addObject("laptops", laptops);
		}else {
			mv = new ModelAndView("create");
			return mv;
		}
		
		return mv;
	}
	
	@GetMapping("showAll")
	public ModelAndView showAll() {
		List<Laptop> laps = serv.getAllLaptops();
		ModelAndView mv = new ModelAndView("showAll");
		mv.addObject("laptops", laps);
		return mv;
	}
}
