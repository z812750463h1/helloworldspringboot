package com.atguigu.springboot.helloworldspringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
    @RequestMapping(value = "/hello1")
    public String hello1(){
        return "ok";
    }
}
