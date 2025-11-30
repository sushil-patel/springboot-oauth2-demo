package com.spring.OAuth2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OAuth2Controller {
    @GetMapping("/")
    public String greet() {
        return "Welcome to Sushil Industries";
    }
}
