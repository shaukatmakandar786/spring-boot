package com.manytomanyexample.service;

import com.manytomanyexample.entity.Course;
import com.manytomanyexample.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public Course addCourse(Course course)
    {
       return courseRepository.save(course);
    }
}
