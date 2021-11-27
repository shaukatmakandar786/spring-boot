package com.springdatajpaeaxmple.repository;

import com.springdatajpaeaxmple.entity.Cource;
import com.springdatajpaeaxmple.entity.CourceMaterial;
import com.springdatajpaeaxmple.entity.Student;
import com.springdatajpaeaxmple.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourceMaterialRepositoryTest {

        @Autowired
        private CourceMaterialRepository courceMaterialRepository;

        @Test
        public void saveCourceMaterial(){

            Cource cource= Cource.builder()
                    .title("DSA")
                    .credit(6)
                    .build();

            CourceMaterial courceMaterial=CourceMaterial.builder()
                    .url("www.google.com")
                    .cource(cource)
                    .build();
            courceMaterialRepository.save(courceMaterial);
        }

        @Test
        public void printAllCourceMaterial()
        {
            List<CourceMaterial> courceMaterialList=courceMaterialRepository.findAll();
            System.out.println("courceMaterialList:="+courceMaterialList);
        }


}