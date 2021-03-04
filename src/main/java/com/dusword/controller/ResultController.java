package com.dusword.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.dusword.Service.JsonService;
import com.dusword.entity.Result;
import com.dusword.entity.Test_user;
import com.dusword.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.SocketHandler;

@RestController
@RequestMapping("/result")
public class ResultController {
    @Autowired
    private ResultRepository resultRepository;
    private Result result;
    private JsonService jsonService;

    @PostMapping("/saveResult")
    public Result saveResult(@RequestBody JSONObject json) {

//        System.out.println(json.toJavaObject(Result.class));
//        System.out.println(json.getJSONObject("result").getJSONObject("infolist").toJavaObject(Result.class));
//        System.out.println(json.getJSONObject("result").getJSONObject("rsppageinfo").toJavaObject(Result.class));
        return resultRepository.save(jsonService.jsonToResult(json));
    }

    @GetMapping("/findAll")
    public List<Result> findAll(){
        return resultRepository.findAll();
    }
}
