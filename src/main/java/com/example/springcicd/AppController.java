package com.example.springcicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @GetMapping
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello")
    public String helloWorld() {
        return "hello World";
    }
}
