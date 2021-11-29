package com.springbootcrudwithrestapiexample.service;

import com.springbootcrudwithrestapiexample.entity.Employee;

import java.util.List;

public interface EmployeeService {

     Employee saveEmployee(Employee employee);
     List<Employee> getAllEmployees();
     Employee getEmployeeById(Long id);
     Employee updateEmployeeById(Employee employee,Long id);
     String deleteEmployeeById(Long id);
}
