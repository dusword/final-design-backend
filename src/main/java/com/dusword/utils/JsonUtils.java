package com.dusword.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 *
 */
public class JsonUtils {

    /**
     * @author lxj
     * @param object  a Java Object
     * @return target Json String
     */
    public static String toJsonString(Object object){
        return JSON.toJSONString(object);
    }

    /**
     * @author lxj
     * @param jsonObject a Json Object
     * @return target Json String
     */
    public static String toJsonString(JSONObject jsonObject){
        return jsonObject.toJSONString();
    }

    /**
     * @author lxj
     * @param jsonString a Json text
     * @param object target Java Object
     * @param <T> type of target Object
     * @return target Java Object
     */
    public static <T> T stringToObject(String jsonString,Class<T> object){
        return JSON.parseObject(jsonString,object);
    }

    /**
     * @author lxj
     * @param jsonString a Json text
     * @return a Json Object
     */
    public static JSONObject toJsonObject(String jsonString){
        return JSON.parseObject(jsonString);
    }


}
