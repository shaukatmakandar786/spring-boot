package com.springbootcrudwebapplication.service;

import com.springbootcrudwebapplication.entity.User;
import com.springbootcrudwebapplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUser()
    {
        return userRepository.findAll();
    }
}
