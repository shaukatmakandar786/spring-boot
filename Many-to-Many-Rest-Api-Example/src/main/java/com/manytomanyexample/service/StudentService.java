package com.manytomanyexample.service;

import com.manytomanyexample.entity.Course;
import com.manytomanyexample.entity.Student;
import com.manytomanyexample.repository.CourseRepository;
import com.manytomanyexample.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student addCourse(Student student)
    {
        return studentRepository.save(student);
    }

}
