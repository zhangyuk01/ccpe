package com.zhangyu.zhangyuinfo.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BlogIndexController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello zhangyublog";
    };


}
