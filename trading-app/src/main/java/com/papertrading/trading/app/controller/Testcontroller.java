package com.papertrading.trading.app.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testcontroller {

    @GetMapping("/test")
    public String test(){
        return "THE backend is working";
    }
}
