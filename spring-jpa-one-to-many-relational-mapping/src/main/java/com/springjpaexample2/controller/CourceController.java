package com.springjpaexample2.controller;

import com.springjpaexample2.entity.Cource;
import com.springjpaexample2.service.CourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourceController {

    @Autowired
    private CourceService courceService;

    @GetMapping("/getcource")
    public List<Cource> getAllCource()
    {
        return courceService.getAllCource();
    }
    @PostMapping("/addcource")
    public Cource addCource(@RequestBody Cource cource)
    {
        return courceService.addCource(cource);
    }

    @DeleteMapping("/deletecource/{id}")
    public String deleteCource(@PathVariable long id)
    {
        return courceService.deleteCource(id);
    }
    @PutMapping("/updatebyid/{id}")
    public Cource updateById(@PathVariable long id)
    {
        return courceService.updateCourceById(id);
    }

}
