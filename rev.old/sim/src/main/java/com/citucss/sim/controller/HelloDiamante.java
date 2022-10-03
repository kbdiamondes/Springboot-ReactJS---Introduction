package com.citucss.sim.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloDiamante {
    @RequestMapping("/hello")
    public String hello(){
        return "Hello, John Doe!";
    }
}
