package com.example.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello this is a springbootdemo";
    }
}

