package com.manytooneexample.controller;

import com.manytooneexample.entity.Course;
import com.manytooneexample.service.CourseService;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping("/course")
    public ResponseEntity<Course> addCourse(@RequestBody Course course)
    {
        return new ResponseEntity<Course>(courseService.addCourse(course),HttpStatus.CREATED);
    }
    @GetMapping("/course")
    public List<Course> getAllCourse()
    {
        return courseService.getAllCourse();
    }

    @GetMapping("course/{id}")
    public ResponseEntity<Course> getCourseById(@PathVariable long id)
    {
        return new ResponseEntity<Course>(courseService.getCourseById(id),HttpStatus.OK);
    }
    @DeleteMapping("course/{id}")
    public ResponseEntity<String> deleteCourseByid(@PathVariable long id)
    {
        return new ResponseEntity<String>(courseService.deleteCourseByid(id),HttpStatus.OK);
    }

    @PutMapping("course/{id}")
    public ResponseEntity<Course> updateCourse(@RequestBody Course course,@PathVariable long id)
    {
        return new ResponseEntity<Course>(courseService.updateCourse(course,id),HttpStatus.OK);
    }
}
