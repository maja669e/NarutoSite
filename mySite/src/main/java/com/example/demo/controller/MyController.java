package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/")
    public String welcome() {
        return ("index");
    }
    @GetMapping("/characters")
    public String characters() {
        return "characters";
    }
    @GetMapping("/about")
    public String about() {
        return "about";
    }

}
