package com.angularboot.example.angularboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api")
public class TestController {
    @GetMapping(path="/hello-world")
    public String helloWorld() {
        return "Hello World From AngularBoot!";
    }
}
