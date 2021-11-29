package com.springbootcrudwithrestapiexample.repository;

import com.springbootcrudwithrestapiexample.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
