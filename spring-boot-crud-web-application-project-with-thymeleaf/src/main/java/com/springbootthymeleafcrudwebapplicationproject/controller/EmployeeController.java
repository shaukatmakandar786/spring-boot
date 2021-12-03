package com.springbootthymeleafcrudwebapplicationproject.controller;

import com.springbootthymeleafcrudwebapplicationproject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee")
    public String viewHomePage(Model model)
    {
        model.addAttribute("listEmployee",employeeService.getAllEmployees());
        return "index";
    }
}
