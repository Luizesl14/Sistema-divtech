package com.div_tech.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {


    @RequestMapping("/")
    public String homePage(){
        return "index";
    }

    @RequestMapping("/controle")
    public String cpainel(){
        return "cpainel";
    }
}
