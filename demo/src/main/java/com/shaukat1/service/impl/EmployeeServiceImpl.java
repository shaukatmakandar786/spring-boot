package com.shaukat1.service.impl;

import com.shaukat1.exception.ResourceNotFoundException;
import com.shaukat1.model.Employee;
import com.shaukat1.repository.EmployeeRepository;
import com.shaukat1.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository repository;

    public EmployeeServiceImpl(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return repository.findAll();
    }

    @Override
    public Employee getEmployeeById(long id) {

        Optional<Employee> employee=repository.findById(id);
//        if(employee.isPresent())
//        {
//            return employee.get();
//        }
//        else {
//            throw new ResourceNotFoundException("Employee","Id",String.valueOf(id));
//        }

        return repository.findById(id).orElseThrow(()->
                    new ResourceNotFoundException("Employee","Id",String.valueOf(id)));

    }

    @Override
    public Employee updateEmployee(Employee employee, long id) {

       Employee existingEmployee= repository.findById(id).orElseThrow(()->
                new ResourceNotFoundException("Employee","Id",String.valueOf(id)));

       existingEmployee.setFirstName(employee.getFirstName());
       existingEmployee.setLastName(employee.getLastName());
       existingEmployee.setEmail(employee.getEmail());

       repository.save(existingEmployee);
        return existingEmployee;
    }

    @Override
    public void deleteEmployee(long id) {
        repository.findById(id).orElseThrow(()->
                new ResourceNotFoundException("Employee","Id",String.valueOf(id)));

         repository.deleteById(id);

    }

}
