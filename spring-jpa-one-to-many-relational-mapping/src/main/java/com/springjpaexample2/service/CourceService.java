package com.springjpaexample2.service;

import com.springjpaexample2.dao.CourceDao;
import com.springjpaexample2.entity.Cource;
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
    public String deleteCource(long id)
    {
        courceDao.deleteById(id);
        return "Deleted Successfully";
    }


}
