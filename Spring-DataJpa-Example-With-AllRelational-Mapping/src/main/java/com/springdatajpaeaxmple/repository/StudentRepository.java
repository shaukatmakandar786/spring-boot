package com.springdatajpaeaxmple.repository;

import com.springdatajpaeaxmple.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

     List<Student> findByFirstName(String FirstName);
     List<Student> findByFirstNameContaining(String name);
     //List<Student> findByLastNameNotNull(String name);
     List<Student> findByGuardianName(String name);

     //JPQL
     @Query("select s from Student s where s.emailId=?1")
     Student getStudentByEmailId(String email);

     //JPQL
     @Query("select s.firstName from Student s where s.emailId=?1")
     String getStudentFirstNameByEmailId(String email);


     //Native query
     @Query(
             value="SELECT * FROM tbl_student s where s.email_address= ?1 ",
             nativeQuery = true
     )
     Student getStudentByEmailIdNative(String email);

     //Native query with named parameter
     @Query(
             value="SELECT * FROM tbl_student s where s.email_address= :emailId",
             nativeQuery = true
     )
     Student getStudentByEmailIdNativeNamedParam(@Param("emailId") String email);

     @Modifying
     @Transactional
     @Query(
             value = "update tbl_student set first_name=?1 where email_address=?2",
             nativeQuery = true
     )
     int updateStudentByEmailId(String firstName,String emailId);

}
