package com.springjpaexample2.service;

import com.springjpaexample2.dao.TeacherDao;
import com.springjpaexample2.entity.Teacher;
import com.springjpaexample2.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {

    @Autowired
    private TeacherDao teacherDao;

    // add teacher details
    public Teacher addTeacher(Teacher teacher)
    {
        return teacherDao.save(teacher);
    }

    // get all teacher details
    public List<Teacher> getAllTeacher()
    {
        return teacherDao.findAll();
    }

    // update teacher
    public Teacher updateTeacher(Teacher teacher,long id)
    {
      Teacher existingTeacher=teacherDao.findById(id).orElseThrow(()->new ResourceNotFoundException("given id is invalid"));
      existingTeacher.setFirstName(teacher.getFirstName());
      existingTeacher.setLastName(teacher.getLastName());
      existingTeacher.setCources(teacher.getCources());
      return teacherDao.save(existingTeacher);

    }

    // delete teacher
    public String deleteTeacher(long id)
    {
        teacherDao.findById(id).orElseThrow(()-> new ResourceNotFoundException("given id is invalid"));
        teacherDao.deleteById(id);
        return "Deleted successfully";
    }
}
