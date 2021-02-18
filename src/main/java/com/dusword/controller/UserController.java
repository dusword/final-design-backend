package com.dusword.controller;

import com.dusword.entity.Test_user;
import com.dusword.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/findAll")
    public List<Test_user> findAll(){
        return userRepository.findAll();
    }
}
