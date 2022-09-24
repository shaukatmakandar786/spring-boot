package com.springdatajpaeaxmple.repository;

import com.springdatajpaeaxmple.entity.Parent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParentRepo extends JpaRepository<Parent,Integer> {
}
