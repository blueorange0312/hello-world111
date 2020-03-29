package com.hello.rong.rongtest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController{

    @RequestMapping("/")
    public String index(){
        return "greetings  wo shi shei  from spring boot !";
    }

}