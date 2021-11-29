package com.manytooneexample.service;

import com.manytooneexample.entity.Course;
import com.manytooneexample.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;


    public Course addCourse(Course course)
    {
        return courseRepository.save(course);
    }

    public List<Course> getAllCourse()
    {
        return courseRepository.findAll();
    }

    public Course getCourseById(long id)
    {
        courseRepository.findById(id).orElseThrow(()-> new RuntimeException("given id is invalid"));
        return courseRepository.getById(id);
    }
    public String deleteCourseByid(long id)
    {
        courseRepository.findById(id).orElseThrow(()->new RuntimeException("given id is invalid"));
        courseRepository.deleteById(id);
        return "Deleted successfully";
    }
    public Course updateCourse(Course course,long id)
    {
        Course existingCourse= courseRepository.findById(id).orElseThrow(()->new RuntimeException("given id is invalid"));
        existingCourse.setTitle(course.getTitle());
        existingCourse.setCredit(course.getCredit());
        existingCourse.setTeacher(course.getTeacher());
        return courseRepository.save(existingCourse);
    }

}
