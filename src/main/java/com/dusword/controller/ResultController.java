package com.dusword.controller;

import com.alibaba.fastjson.JSONObject;
import com.dusword.Mapper.ResultMapper;
import com.dusword.Service.JsonService;
import com.dusword.entity.Result;
import com.dusword.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/result")
public class ResultController {
    @Autowired
    private ResultRepository resultRepository;
    private Result result;
    @Autowired
    private ResultMapper resultMapper;
    @Autowired
    private JsonService jsonService;

    @PostMapping("/saveResult")
    public Result saveResult(@RequestBody JSONObject json) {
        Result result=jsonService.jsonToResult(json);
        return resultRepository.save(result);
    }

    @GetMapping("/findAll")
    public List<Result> findAll(){
        return resultRepository.findAll();
    }

    @GetMapping("/findById/{id}")
    public Optional<Result> findById(@PathVariable("id") Integer id){
        return  resultRepository.findById(id);
    }

    @GetMapping("/selectAll")
    public List<Result> selectAll(){
        return resultMapper.selectList(null);
    }
//
//    @GetMapping("/selectById")
//    public Result selectById(@RequestBody JSONObject jsonObject){
//        return resultMapper.selectById(jsonObject.getInteger("Id"));
//    }
//    @GetMapping("/selectById")
//    public Result selectById(@RequestParam() int id) {
//        return resultMapper.selectById(id);
//    }
}
