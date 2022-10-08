package in.shaukat.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import in.shaukat.entity.ImageModel;
import in.shaukat.entity.Student;
import in.shaukat.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping(value = {"/addStudent"}, consumes = {MediaType.MULTIPART_FORM_DATA_VALUE })
    public Student addStudent(@RequestPart("student") String student,
                              @RequestPart("file")MultipartFile[] file){

        Student studentJson = getJson(student);

       try{
           Set<ImageModel> imageModels = uploadImage(file);
           studentJson.setStudentImage(imageModels);
           Student save = studentRepository.save(studentJson);
           return save;
       }
       catch (Exception e){
           System.out.println(e.getMessage());
           return null;
       }

    }
    public Student getJson(String student) {

      Student studentJson=new Student();

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            studentJson = objectMapper.readValue(student, Student.class);
        } catch (IOException err) {
            System.out.printf("Error", err.toString());
        }

        return studentJson;

    }
    public Set<ImageModel> uploadImage(MultipartFile[] multipartFiles)throws IOException{

        Set<ImageModel> imageModels=new HashSet<>();
        for(MultipartFile file:multipartFiles){
            ImageModel imageModel=new ImageModel();
            imageModel.setName(file.getName());
            imageModel.setType(file.getContentType());
            imageModel.setPicByte(file.getBytes());

            imageModels.add(imageModel);
        }
        return imageModels;
    }
}
