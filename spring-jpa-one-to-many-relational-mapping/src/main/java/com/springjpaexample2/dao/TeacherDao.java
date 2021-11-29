package com.springjpaexample2.dao;

import com.springjpaexample2.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface TeacherDao extends JpaRepository<Teacher,Long> {

    @Modifying
    @Transactional
    @Query(
            value = "update cource set credit=?1 where email_address=?2",
            nativeQuery = true
    )
    int updateStudentByEmailId(String firstName,String emailId);

}

