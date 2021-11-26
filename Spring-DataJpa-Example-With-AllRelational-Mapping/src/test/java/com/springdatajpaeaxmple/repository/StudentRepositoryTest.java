package com.springdatajpaeaxmple.repository;

import com.springdatajpaeaxmple.entity.Guardian;
import com.springdatajpaeaxmple.entity.Student;
import lombok.Builder;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {

        @Autowired
        private StudentRepository studentRepository;

        @Test
        @Disabled
        public void saveStudent(){

            Student student=Student.builder()
                    .emailId("zahid@gmail.com")
                    .firstName("zahid")
                    .lastName("chand")
//                    .guardianName("shaukat")
//                    .guardianEmail("pqr@gmail.com")
//                    .guardianMobile("8965254875")
                    .build();
            studentRepository.save(student);
        }
        @Test
        public void saveStudentWithGuardian()
        {
            Guardian guardian=Guardian.builder()
                    .name("shaukat")
                    .email("shaukat@gmail.com")
                    .mobile("8596587458")
                    .build();

            Student student=Student.builder()
                    .firstName("zakir")
                    .lastName("attar")
                    .emailId("whgjjir@gmail.com")
                    .guardian(guardian)
                    .build();
            studentRepository.save(student);
        }

        @Test
        public void printAllStuent()
        {
            List<Student> studentList=studentRepository.findAll();
            System.out.println(studentList);
        }

        @Test
        public void printByFirstName()
        {
            List<Student> studentList=studentRepository.findByFirstName("zakir");
            System.out.println(studentList);
        }

        @Test
        public void printByFirstNameContaining()
        {
            List<Student> studentList=studentRepository.findByFirstNameContaining("kir");
            System.out.println(studentList);
        }

        @Test
        public void printGuardianName()
        {
            List<Student> studentList=studentRepository.findByGuardianName("shaukat");
            System.out.println(studentList);
        }

        @Test
        public void printStudentByEmailId()
        {
            Student student=studentRepository.getStudentByEmailId("wakir@gmail.com");
            System.out.println(student);
        }

        @Test
        public void printStudentFirstNameByEmailId()
        {
            String fname=studentRepository.getStudentFirstNameByEmailId("wakir@gmail.com");
            System.out.println("Student First name is "+fname);
        }
        @Test
        public void printStudentByEmailIdNative()
        {
            Student studentList=studentRepository.getStudentByEmailIdNative("wakir@gmail.com");
            System.out.println(studentList);
        }

        @Test
        public void printStudentByEmailIdNativeNamedParam()
        {
            Student student=studentRepository.getStudentByEmailIdNativeNamedParam("wakir@gmail.com");
            System.out.println(student);
        }

        @Test
        public void updateStudentByEmailIdTest()
        {
            int i=studentRepository.updateStudentByEmailId("wasim","wakir@gmail.com");
            System.out.println(i);
        }
}