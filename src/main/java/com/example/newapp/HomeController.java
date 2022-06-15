package com.example.newapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/public")
public class HomeController {

    @GetMapping("/home")
    public String home(){
        return "Home page..";
    }
    @GetMapping("/login")
    public String login(){
        return "Login page..";
    }
    @GetMapping("/register")
    public String register(){
        return "Register page..";
    }
}
