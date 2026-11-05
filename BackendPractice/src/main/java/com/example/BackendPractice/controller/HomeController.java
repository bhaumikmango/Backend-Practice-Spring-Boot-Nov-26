package com.example.BackendPractice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "Welcome Home";
    }
    
    @RequestMapping("/about")
    public String about(){
        return "I'm Bhaumik";
    }
}