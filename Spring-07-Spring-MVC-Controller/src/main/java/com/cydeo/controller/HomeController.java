package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String homePage(){
        return "home.html";
    }

    @RequestMapping("/welcome")
    public String welcomePage(){
        return "welcome.html";
    }

    @RequestMapping
    public String page(){
        return "welcome.html";
    }

}
