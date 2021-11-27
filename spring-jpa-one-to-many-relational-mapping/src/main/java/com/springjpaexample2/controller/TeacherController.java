package com.springjpaexample2.controller;

import com.springjpaexample2.entity.Teacher;
import com.springjpaexample2.service.TeacherService;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @PostMapping("/teacher")
    public Teacher addTeacher(@RequestBody Teacher teacher)
    {
        return teacherService.addTeacher(teacher);
    }

    @GetMapping("/teacher")
    public List<Teacher> getAllTeacher()
    {
        return teacherService.getAllTeacher();
    }

}
