package com.ilyong.springbootcicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @GetMapping
    public String root() {
        return "root";
    }

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello My World With Jenkins ";
    }
}
