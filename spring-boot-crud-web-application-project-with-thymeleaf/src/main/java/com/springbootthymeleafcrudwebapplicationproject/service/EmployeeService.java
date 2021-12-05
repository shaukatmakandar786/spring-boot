package com.springbootthymeleafcrudwebapplicationproject.service;

import com.springbootthymeleafcrudwebapplicationproject.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();
}
