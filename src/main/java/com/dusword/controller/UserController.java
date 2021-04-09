package com.dusword.controller;

import com.dusword.entity.Test_user;
import com.dusword.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/findAll/{page}/{size}")
    public Page<Test_user> findAll(@PathVariable("page")Integer page, @PathVariable("size") Integer size){
        Pageable pageable= PageRequest.of(page-1,size);
        return userRepository.findAll(pageable);
    }
    @PostMapping("/saveUser")
    public Test_user saveUser(@RequestBody Test_user user){
        return userRepository.save(user);
    }
}
