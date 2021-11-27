package com.springjpaexample1.dao;

import com.springjpaexample1.entity.CourceMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface CourceMaterialDao extends JpaRepository<CourceMaterial,Long> {

}
