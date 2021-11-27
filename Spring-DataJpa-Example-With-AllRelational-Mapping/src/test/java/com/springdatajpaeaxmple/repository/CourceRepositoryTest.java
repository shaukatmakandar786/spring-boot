package com.springdatajpaeaxmple.repository;

import com.springdatajpaeaxmple.entity.Cource;
import com.springdatajpaeaxmple.entity.Guardian;
import com.springdatajpaeaxmple.entity.Student;
import com.springdatajpaeaxmple.entity.Teacher;
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

    @Test
    public void saveCourceWithTeacher()
    {
        Teacher teacher=Teacher.builder()
                .firstName("zakir")
                .lastName("attar")
                .build();

        Cource cource=Cource.builder()
                .title("python")
                .credit(5)
                .teacher(teacher)
                .build();
        courceRepository.save(cource);
    }

    @Test
    public void saveCourceWithStudentAndTeacher()
    {

        Student student1= Student.builder()
                .firstName("jkd")
                .lastName("hdj")
                .emailId("dhdagg")
                .build();

        Student student2= Student.builder()
                .firstName("reyuier")
                .lastName("adsfhj")
                .emailId("addajh")
                .build();

        Teacher teacher=Teacher.builder()
                .firstName("abc")
                .lastName("jkhg")
                .build();

        Cource cource=Cource.builder()
                .title("PHP")
                .credit(5)
                .students(List.of(student1,student2))
                .teacher(teacher)
                .build();

        courceRepository.save(cource);
    }
}