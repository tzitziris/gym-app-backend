package com.sof.gym_project_backend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @GetMapping("/")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }


}
