package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloWorld {

    //如果想要访问templates里面的静态页面需要导入thymeleaf包
/*     实现访问localhost:8080不是访问static默认里面的页面，而是访问模板引擎里面的页面*/
    @RequestMapping("/login")
    public String sayHello(){
        return "login";
    }

    @RequestMapping("/success")
    public String success(Map<String, Object> map){
        map.put("hello","<h1>你好</h1>");
        map.put("users", Arrays.asList("zhangsan","lisi"));
        return "success";
    }

}
