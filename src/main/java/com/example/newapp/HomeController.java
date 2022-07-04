package com.example.newapp;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @RequestMapping("user")
    @ResponseBody
    public Principal user(Principal principal) {
    	return principal;
    }
}
