package com.springbootrestapi.controller;
import com.springbootrestapi.entities.Cource;
import com.springbootrestapi.services.CourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class MyController {

    @Autowired
    private CourceService courceService;

    // get the Cources
    @GetMapping("/cources")
    public List<Cource> getCource() {

        return this.courceService.getCource();
    }

    // get cource by id
    @GetMapping("/cources/{courceId}")
    public Cource getCource(@PathVariable String courceId)
    {
        return this.courceService.getCource(Long.parseLong(courceId));
    }

    // add cource
    @PostMapping("/cources")
    public Cource addCource(@RequestBody Cource cource)
    {
        return this.courceService.addCource(cource);
    }

    @PutMapping("/cources")
    public Cource updateCource(@RequestBody Cource cource)
    {
        return this.courceService.updateCource(cource);
    }
    @DeleteMapping("/cources/{courceId}")
    public Cource deleteCource(@PathVariable String courceId)
    {
        return courceService.deleteCource(Long.parseLong(courceId));
    }
}