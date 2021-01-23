package com.springcms.shoppingcart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    @GetMapping("/somerandompage")
    public String home(){

        return "home";
    }
}