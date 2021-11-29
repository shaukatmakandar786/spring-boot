package com.springjpaexample2.dao;

import com.springjpaexample2.entity.Cource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourceDao extends JpaRepository<Cource,Long> {

}

