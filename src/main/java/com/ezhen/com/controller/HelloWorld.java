package com.ezhen.com.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


/**
 * Created by EDZ on 2018/11/23.
 */
@Controller
public class HelloWorld {
    @RequestMapping({"/","/login.html"})
    public String index(){
        return "login";
    }

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }

    //classpath:/template/success.html
    @RequestMapping("/success")
    public String success(Map<String,String> map){
        map.put("nihao","你好刚刚 ");
        return "success";
    }
}
