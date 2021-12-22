package com.practice.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.expression.Lists;

@Controller
public class MyController {
	
	@GetMapping("/about")
	public String about(Model model)
	{
		System.out.println("Inside about handler");
		
		model.addAttribute("name","Shaukat Makandar");
		
		
		return "about";
	
	}
	
	@GetMapping("/iterator")
	public String iterator(Model model)
	{
		List<String> names = List.of("shaukat","wasim","asif","zahid");
		model.addAttribute("names",names);
		return "iterator";
	}
	
	//Handler for conditional statement
	@GetMapping("/condition")
	public String conditionalHandler(Model model)
	{
		
		System.out.println("conditional handler executed...");
		model.addAttribute("isActive",false);
		model.addAttribute("gender","M");
		
		List<Integer> list = List.of(6,8,9,6,7);
		model.addAttribute("mylist",list);
		return "condition";
	}
	
	//handler for including fregments
	@GetMapping("/service")
	public String serviceHandler(Model m)
	{
		return "service";
	}

}
