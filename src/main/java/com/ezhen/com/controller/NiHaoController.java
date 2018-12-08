package com.ezhen.com.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by EDZ on 2018/11/23.
 */
@Controller
public class NiHaoController {
    @ResponseBody
    @RequestMapping("/nihao")
    public String nihao(Map<String,String> map){
        map.put("nihao","你好");
        return "ninhao";
    }
}
