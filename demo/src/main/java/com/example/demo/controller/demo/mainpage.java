package com.example.demo.controller.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BilgisayarMainController{
    @GetMapping("/main")
    public class mainpage() {
        return"demo";
    }
    @PostMapping("/main")
    public String mainpageP(){
        System.out.println();
        return "demo";
}}
