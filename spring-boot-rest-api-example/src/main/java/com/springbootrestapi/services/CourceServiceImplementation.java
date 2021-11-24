package com.springbootrestapi.services;

import com.springbootrestapi.dao.CourceDao;
import com.springbootrestapi.entities.Cource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourceServiceImplementation implements  CourceService {

    @Autowired
    private CourceDao courceDao;

    public CourceServiceImplementation() {
         list.add(new Cource(103, "java ME", "this is ME java cource"));
    }

    @Override
    public List<Cource> getCource() {

        return courceDao.findAll();
    }

    @Override
    public Cource getCource(long courceId) {

        return courceDao.getById(courceId);
    }

    @Override
    public Cource addCource(Cource cource) {

        courceDao.save(cource);
        return cource;
    }

    @Override
    public Cource updateCource(Cource cource) {

        return courceDao.save(cource);
    }

    @Override
    public Cource deleteCource(long courceId) {

        Cource entity=courceDao.getById(courceId);
        courceDao.delete(entity);
        return null;
    }

}

