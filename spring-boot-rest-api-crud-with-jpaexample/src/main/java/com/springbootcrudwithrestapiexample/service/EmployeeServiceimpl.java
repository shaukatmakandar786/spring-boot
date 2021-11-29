package com.springbootcrudwithrestapiexample.service;

import com.springbootcrudwithrestapiexample.entity.Employee;
import com.springbootcrudwithrestapiexample.exception.ResourceNotfoundException;
import com.springbootcrudwithrestapiexample.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeServiceimpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee) {

        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {

        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {

        return employeeRepository.findById(id).orElseThrow(()-> new ResourceNotfoundException("Employee","Id",id));
    }

    @Override
    public Employee updateEmployeeById(Employee employee, Long id) {

        //we need to check here weather employee with given id is exist in database or not

        Employee existingEmployee = employeeRepository.findById(id).orElseThrow(()-> new ResourceNotfoundException("Employee","Id",id));

        existingEmployee.setFirstName(employee.getFirstName());
        existingEmployee.setLastName(employee.getLastName());
        existingEmployee.setEmail(employee.getEmail());
        employeeRepository.save(existingEmployee);
        return existingEmployee;
    }

    @Override
    public String deleteEmployeeById(Long id) {

        employeeRepository.findById(id).orElseThrow(()-> new ResourceNotfoundException("Employee","Id",id));
        employeeRepository.deleteById(id);
        return "Deleted Successfully";
    }
}
