package com.springjpaexample2.service;

import com.springjpaexample2.dao.TeacherDao;
import com.springjpaexample2.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    private TeacherDao teacherDao;

    public Teacher addTeacher(Teacher teacher)
    {
        return teacherDao.save(teacher);
    }
    public List<Teacher> getAllTeacher()
    {
        return teacherDao.findAll();
    }
}
