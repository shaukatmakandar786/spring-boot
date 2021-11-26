package com.springdatajpaeaxmple.repository;

import com.springdatajpaeaxmple.entity.Cource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourceRepositoryTest {

    @Autowired
    private CourceRepository courceRepository;

    @Test
    public void printCource()
    {
        List<Cource> courceList=courceRepository.findAll();
        System.out.println(courceList);
    }

}