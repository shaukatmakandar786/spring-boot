package com.manytomanyexample.controller;

import com.manytomanyexample.entity.Course;
import com.manytomanyexample.service.CourseService;
import com.manytomanyexample.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping("/course")
    public Course addCourse(@RequestBody Course course)
    {
        return courseService.addCourse(course);
    }

}
