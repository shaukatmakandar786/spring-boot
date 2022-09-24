package com.springdatajpaeaxmple.controller;

import com.springdatajpaeaxmple.entity.Child;
import com.springdatajpaeaxmple.entity.Parent;
import com.springdatajpaeaxmple.repository.ChildRepo;
import com.springdatajpaeaxmple.repository.ParentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private ParentRepo parentRepo;

    @Autowired
    private ChildRepo childRepo;


    @PostMapping("/add/parent")
    public Parent addParent(@RequestBody Parent parent){
        Parent parentCreated = parentRepo.save(parent);
        return parentCreated;
    }

    @PostMapping("/add/child")
    public Child addChild(@RequestBody Child child){
        Child parentCreated =childRepo.save(child);
        return parentCreated;
    }

    @GetMapping("/get/parent")
    public List<Parent> getParentList(){

        return parentRepo.findAll();
    }
    @GetMapping("/get/child")
    public List<Child> getChildList(){

        return childRepo.findAll();
    }
    @GetMapping("/get/child/{id}")
    public List<Child> getByParentId(@PathVariable String id){
        List<Child> byParentId = childRepo.findByParentId(Integer.valueOf(id));
        return byParentId;
    }

}
