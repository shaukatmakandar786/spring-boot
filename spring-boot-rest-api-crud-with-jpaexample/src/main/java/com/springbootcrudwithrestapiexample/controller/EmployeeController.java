package com.springbootcrudwithrestapiexample.controller;
import com.springbootcrudwithrestapiexample.entity.Employee;
import com.springbootcrudwithrestapiexample.service.EmployeeService;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    //save employee Rest Api
    @PostMapping()
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee)
    {
        return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
    }

    //getAll employee rest api
    @GetMapping()
    public List<Employee> getAllEmployees()
    {
        return employeeService.getAllEmployees();
    }

    //get employee by id rest api
    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable long id)
    {
        return new ResponseEntity<Employee>(employeeService.getEmployeeById(id),HttpStatus.OK);
    }

    //update employee by id
    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployeeById(@RequestBody Employee employee,@PathVariable Long id)
    {
        return new ResponseEntity<Employee>(employeeService.updateEmployeeById(employee,id),HttpStatus.OK);
    }

    //delete employee by id
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployeeById(@PathVariable Long id)
    {
        return new ResponseEntity<String>(employeeService.deleteEmployeeById(id),HttpStatus.OK);
    }
}
