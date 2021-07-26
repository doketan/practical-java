package com.course.practicaljava.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class DefaultRestControllersCheck {

    @GetMapping(value = "/welcoming")
    public String defaultMethod(){
        return ("spring boot welcoming");
    }
}
