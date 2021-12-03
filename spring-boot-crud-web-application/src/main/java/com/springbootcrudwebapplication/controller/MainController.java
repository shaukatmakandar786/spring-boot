package com.springbootcrudwebapplication.controller;

import com.springbootcrudwebapplication.entity.User;
import com.springbootcrudwebapplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String showHomePage()
    {
        return "index";
    }

    @GetMapping("/users")
    public String getAllUser(Model model)
    {
        List<User> allUser = userService.getAllUser();
        model.addAttribute("listUser",allUser);
        return "users";
    }
}
