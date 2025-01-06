package com.example.myapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//controller class
@Controller
public class HomeController {

    //@RequestMapping(value = {"", "/home", "/"}, method = RequestMethod.GET)
    @GetMapping({"/home", "", "/"})
    //handler method
    public String showHomePage(Model model) {
        model.addAttribute("myname", "Bushan");
        model.addAttribute("title", "Home");
        return "mypage";
    }

    @GetMapping("/about-us")
    public String showAboutUsPage(Model model) {
        model.addAttribute("title", "About Us");
        return "aboutus";
    }

    @GetMapping("/contact-us")
    public String showContactUsPage(Model model) {
        model.addAttribute("title", "Contact Us");
        return "contactus";
    }

    @GetMapping("/services")
    public String showServicesPage(Model model) {
        model.addAttribute("title", "Services");
        return "services";
    }
}
