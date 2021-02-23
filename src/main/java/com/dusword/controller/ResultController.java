package com.dusword.controller;

import com.dusword.entity.Result;
import com.dusword.entity.Test_user;
import com.dusword.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/result")
public class ResultController {
    @Autowired
    private ResultRepository resultRepository;

    @PostMapping("/saveResult")
    public Result saveResult(@RequestBody Result result) {
        return resultRepository.save(result);
    }

    @GetMapping("/findAll")
    public List<Result> findAll(){
        return resultRepository.findAll();
    }
}
