package com.example.templateintegration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"/home", "", "/"})
    public String showHomePage(Model model) {
        model.addAttribute("title", "Home");
        return "master";
    }

    @GetMapping("/services")
    public String showServicesPage(Model model) {
        model.addAttribute("title", "Services");
        return "master";
    }

    @GetMapping("/about")
    public String showAboutPage(Model model) {
        model.addAttribute("title", "About");
        return "master";
    }

    @GetMapping("/contact")
    public String showContactPage(Model model) {
        model.addAttribute("title", "Contact");
        return "master";
    }
}
