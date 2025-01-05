package com.example.myapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//controller class
@Controller
public class HomeController {

    @RequestMapping({"", "/home", "/"})
    //handler method
    public String showHomePage() {
        return "mypage";
    }
}
