package com.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@GetMapping("/about")
	public String about(Model model)
	{
		System.out.println("Inside about handler");
		
		model.addAttribute("name","Shaukat Makandar");
		
		
		return "about";
	
	}

}
