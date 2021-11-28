package com.springjpaexample2.controller;

import com.springjpaexample2.entity.Teacher;
import com.springjpaexample2.service.TeacherService;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.support.SimpleTriggerContext;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @PostMapping("/addteacher")
    public Teacher addTeacher(@RequestBody Teacher teacher)
    {
        return teacherService.addTeacher(teacher);
    }

    @GetMapping("/getteacher")
    public List<Teacher> getAllTeacher()
    {
        return teacherService.getAllTeacher();
    }
    @PutMapping("/updateteacher")
    public Teacher updateTeacher(@RequestBody Teacher teacher)
    {
        return teacherService.updateTeacher(teacher);
    }
    @DeleteMapping("/deleteteacher/{id}")
    public String deleteTeacher(@PathVariable long id)
    {
        return teacherService.deleteTeacher(id);
    }

}
