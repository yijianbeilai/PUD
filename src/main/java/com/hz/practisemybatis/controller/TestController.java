package com.hz.practisemybatis.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {
    @RequestMapping("test1")
    public void test1(){
        int i=1;
        i+=1;
        System.out.println("Hello World!!!");
    }
}
