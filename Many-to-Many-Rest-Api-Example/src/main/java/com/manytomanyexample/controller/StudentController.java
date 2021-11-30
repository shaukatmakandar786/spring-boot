package com.manytomanyexample.controller;

import com.manytomanyexample.entity.Course;
import com.manytomanyexample.entity.Student;
import com.manytomanyexample.service.CourseService;
import com.manytomanyexample.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/student")
    public Student addCourse(@RequestBody Student student)
    {
        return studentService.addCourse(student);
    }

}
