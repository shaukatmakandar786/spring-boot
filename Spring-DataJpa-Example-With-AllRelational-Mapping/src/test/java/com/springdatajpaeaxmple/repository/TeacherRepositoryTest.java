package com.springdatajpaeaxmple.repository;

import com.springdatajpaeaxmple.entity.Cource;
import com.springdatajpaeaxmple.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TeacherRepositoryTest {

    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    public void saveTeacher()
    {
        Cource courceCPP=Cource.builder()
                .title("cpp")
                .credit(6)
                .build();

        Cource courceJavaScipt=Cource.builder()
                .title("JavaScipt")
                .credit(5)
                .build();

        Teacher teacher=Teacher.builder()
                .firstName("Nasir")
                .lastName("shaikh")
                //.cources(List.of(courceCPP,courceJavaScipt))
                .build();
        teacherRepository.save(teacher);
    }

}