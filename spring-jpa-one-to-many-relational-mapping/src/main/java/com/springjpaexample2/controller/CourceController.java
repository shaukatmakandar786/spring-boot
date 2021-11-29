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

    @GetMapping("/cource")
    public List<Cource> getAllCource()
    {
        return courceService.getAllCource();
    }
    @PostMapping("/cource")
    public Cource addCource(@RequestBody Cource cource)
    {
        return courceService.addCource(cource);
    }

    @DeleteMapping("/cource/{id}")
    public String deleteCourceById(@PathVariable long id)
    {
        return courceService.deleteCourceById(id);
    }
    @PutMapping("/cource/{id}")
    public Cource updateCourceById(@RequestBody Cource cource,@PathVariable long id)
    {
        return courceService.updateCourceById(cource,id);
    }
}
