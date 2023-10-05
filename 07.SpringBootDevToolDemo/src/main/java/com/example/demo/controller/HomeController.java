package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping({"","/","/home"})
    public String goToHomePage(Model model){
        model.addAttribute("username","Maung Maung DEV TOOL Test");
        return "home.html";
    }
}
