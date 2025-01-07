package com.example.myapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//controller class
@Controller
public class HomeController {

    //@RequestMapping(value = {"", "/home", "/"}, method = RequestMethod.GET)
    @GetMapping({"/home", "", "/"})
    //handler method
    public String showHomePage(Model model) {
        model.addAttribute("myname", "Bushan");
        model.addAttribute("title", "Home");
        return "home";
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

    @GetMapping("/products")
    public String showProductsPage(Model model, @RequestParam(required = false, defaultValue = "Unknown Product") String name,
                                   @RequestParam(required = false, name = "price", defaultValue = "0.00") Double price) {
        System.out.println("Receiving the parameter from URL::::"+name);
        System.out.println("Receiving the parameter from URL::::"+price);
        model.addAttribute("title", "Products");
        model.addAttribute("appname", name);
        return "products";
    }

    @GetMapping("/products/{productname}/details")
    public String showProductDetailsPage(Model model, @PathVariable String productname) {
        System.out.println("Product Name:::"+productname);
        model.addAttribute("title", "Product Details");
        model.addAttribute("productId", productname);
        return "product-details";
    }
}
