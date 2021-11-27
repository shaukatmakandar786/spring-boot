package com.springjpaexample1.service;

import com.springjpaexample1.dao.CourceMaterialDao;
import com.springjpaexample1.entity.CourceMaterial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourceMaterialService {

    @Autowired
    private CourceMaterialDao courceMaterialDao;

    public CourceMaterial addCourceMaterial(CourceMaterial courceMaterial)
    {
        return courceMaterialDao.save(courceMaterial);
    }
    public List<CourceMaterial> getCourceMaterial()
    {
        return courceMaterialDao.findAll();
    }
    public String deleteCourceMaterialByID(Long id)
    {
         courceMaterialDao.deleteById(id);
         return "Deleted Successfull";
    }

    public CourceMaterial updateCourceMaterial(CourceMaterial courceMaterial)
    {
        return courceMaterialDao.save(courceMaterial);
    }

}
