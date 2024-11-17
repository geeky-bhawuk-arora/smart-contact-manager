package com.scm.ScmApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PageController {

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("name","Bhawuk Arora");
        System.out.println("Home page loading...");
        return "home";
    }

    @GetMapping("/about")
    public String about() {
        System.out.println("About page loading...");
        return "about";
    }
    
    @GetMapping("/services")
    public String services() {
        System.out.println("Services page loading...");
        return "services";
    }
}
