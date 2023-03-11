package com.MySpringBoot.MySbExample.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/")
    public String Hello(){
        return "welcome back!!!";
    }
}
