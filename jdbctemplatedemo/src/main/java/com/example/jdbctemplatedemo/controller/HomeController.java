package com.example.jdbctemplatedemo.controller;

import com.example.jdbctemplatedemo.model.User;
import com.example.jdbctemplatedemo.service.RegisterService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class HomeController {

    private final RegisterService registerService;

    @GetMapping({"/home", "", "/"})
    public String showHomePage(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute User user) {
        System.out.println("Printing the user details:"+user);
        registerService.register(user);
        return "success";
    }
}
