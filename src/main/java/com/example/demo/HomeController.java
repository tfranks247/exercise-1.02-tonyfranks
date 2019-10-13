package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String homePage(Model model){
        model.addAttribute("myvar", "This is my first of two messages");
        model.addAttribute("myvar1", "This is my second of two messages");
        return "hometemplate";
    }
}
