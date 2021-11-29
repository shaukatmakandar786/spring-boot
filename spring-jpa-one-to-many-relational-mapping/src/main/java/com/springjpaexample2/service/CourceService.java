package com.springjpaexample2.service;

import com.springjpaexample2.dao.CourceDao;
import com.springjpaexample2.entity.Cource;
import com.springjpaexample2.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class CourceService {

    @Autowired
    private CourceDao courceDao;

    public List<Cource> getAllCource()
    {
        return courceDao.findAll();
    }
    public Cource addCource(Cource cource)
    {
        return courceDao.save(cource);
    }
    public String deleteCourceById(long id)
    {
        courceDao.findById(id).orElseThrow(()->new ResourceNotFoundException("given id is invalid"));
        courceDao.deleteById(id);
        return "Deleted Successfully";
    }
    public Cource updateCourceById(Cource cource,long id)
    {
        Cource existingCource= courceDao.findById(id).orElseThrow(()-> new ResourceNotFoundException("given id is invalid"));
        existingCource.setTitle(cource.getTitle());
        existingCource.setCredit(cource.getCredit());

        return courceDao.save(existingCource);

    }


}
