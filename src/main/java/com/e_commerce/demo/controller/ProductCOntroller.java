package com.e_commerce.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductCOntroller {

    @RequestMapping("/")
    @ResponseBody
    public String greeting(){
        // System.out.println("hellooooo");
        return "hello world";
    }

}
