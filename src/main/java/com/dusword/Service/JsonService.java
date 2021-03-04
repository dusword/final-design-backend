package com.dusword.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dusword.entity.Result;
import org.springframework.stereotype.Service;


public interface JsonService {
     Result jsonToResult(JSONObject json);
}
