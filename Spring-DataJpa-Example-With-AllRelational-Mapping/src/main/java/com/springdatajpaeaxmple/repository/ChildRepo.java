package com.springdatajpaeaxmple.repository;

import com.springdatajpaeaxmple.entity.Child;
import com.springdatajpaeaxmple.entity.Parent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChildRepo extends JpaRepository<Child,Integer> {

    List<Child> findByParentId(Integer id);
}
