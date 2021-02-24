package com.dusword.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
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
    public Result saveResult(@RequestBody JSONObject json) {
        Result res=new Result();
        res.setErrmsg(json.getString("errmsg"));
        res.setErrcode(json.getInteger("errcode"));
        JSONObject result=json.getJSONObject("result");
        JSONObject rsppageinfo=result.getJSONObject("rsppageinfo");
        res.setTotalrownum(rsppageinfo.getInteger("totalrownum"));
        res.setRownum(rsppageinfo.getInteger("rownum"));
        JSONObject infolist=result.getJSONObject("infolist");
        res.setReserve(infolist.getString("reserve"));
        res.setResbindcode(infolist.getString("resbindcode"));
        res.setIsbind(infolist.getInteger("isbind"));
        res.setIscamincomplexipc(infolist.getInteger("iscamincomplexipc"));
        res.setResattribute(infolist.getInteger("resattribute"));
        res.setIssuperipc(infolist.getInteger("issuperipc"));
        res.setOrgname(infolist.getString("orgname"));
        JSONObject resitemv1=infolist.getJSONObject("resitemv1");
        res.setRescode(resitemv1.getString("rescode"));
        res.setResextstatus(resitemv1.getInteger("resextstatus"));
        res.setResstatus(resitemv1.getInteger("resstatus"));
        res.setOrgcode(resitemv1.getString("orgcode"));
        res.setResisbeshare(resitemv1.getInteger("resisbeshare"));
        res.setResisforeign(resitemv1.getInteger("resisforeign"));
        res.setStreamnum(resitemv1.getInteger("streamnum"));
        res.setResname(resitemv1.getString("resname"));
        res.setRessubtype(resitemv1.getInteger("ressubtype"));
        res.setRestype(resitemv1.getInteger("restype"));
        res.setHasbrdsubres(infolist.getInteger("hasbrdsubres"));
        res.setDevencodeset(infolist.getInteger("devencodeset"));
        res.setVoicestatus(infolist.getInteger("voicestatus"));
        res.setSubtypeofsubtype(infolist.getInteger("subtypeofsubtype"));


        return resultRepository.save(res);
    }

    @GetMapping("/findAll")
    public List<Result> findAll(){
        return resultRepository.findAll();
    }
}
