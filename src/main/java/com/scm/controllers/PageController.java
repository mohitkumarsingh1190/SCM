package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("Home Page Handler");
        model.addAttribute("name", "celebal technology");
        return "home"; // This returns the home.html template
    }
    @GetMapping("/about")
    public String About(Model model){
        model.addAttribute("profileLink", "https://www.google.com");

        return "about";
    }

    @GetMapping("/base")
    public String Base(Model model) {
        return "base";
    }
    
    @GetMapping("/services")
    public String Services(Model model){
        return "services";
    }
}
