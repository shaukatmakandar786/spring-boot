package com.springjpaexample1.controller;

import com.springjpaexample1.entity.CourceMaterial;
import com.springjpaexample1.service.CourceMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourceMaterialController {

    @Autowired
    private CourceMaterialService courceMaterialService;

    @GetMapping("/cource")
    public List<CourceMaterial> getCourceMaterial()
    {
        return courceMaterialService.getCourceMaterial();
    }

    @PostMapping("/cource")
    public CourceMaterial addCourceMaterial(@RequestBody CourceMaterial courceMaterial)
    {
        return courceMaterialService.addCourceMaterial(courceMaterial);
    }

    @DeleteMapping("cource/{id}")
    public String deleteCourceMaterialByID(@PathVariable Long id)
    {
         return courceMaterialService.deleteCourceMaterialByID(id);

    }

    @PutMapping("/cource")
    public CourceMaterial updateCourceMaterial(@RequestBody CourceMaterial courceMaterial)
    {
        return courceMaterialService.updateCourceMaterial(courceMaterial);
    }
}
