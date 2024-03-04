package com.example.service_delivery_pigeons_cyborg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class MainController {
    @GetMapping("/")
    public String home(){
        return "home";
    }
    @GetMapping("/sergei")
    public String sergei(){
        return "sergei";
    }
    @GetMapping("/edik")
    public String edik (){
        return "edik";
    }
    @GetMapping("/anton")
    public String anton(){
        return "anton";
    }
    @GetMapping("/last")
    public String last(){
        return "last";
    }
}
