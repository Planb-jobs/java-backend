package com.jobs.planb.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoreController {


    @GetMapping("/")
    public String getHome(){
        return "Home";
    }
    @GetMapping("/test")
    public String getTest(){
        return "Test";
    }


}
