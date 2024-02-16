package com.tushar.springsecurity.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello")
    public String greet(HttpServletRequest req){
        return "Hello World" + req.getSession().getId();
    }

    @GetMapping("about")
    public String about(HttpServletRequest req){
        return "Tushar Pathak" + req.getSession().getId();
    }
}
