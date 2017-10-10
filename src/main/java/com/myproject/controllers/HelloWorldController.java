package com.myproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by DICT on 10/10/2017.
 */
@Controller
public class HelloWorldController {
    @RequestMapping("/")
    public String sayHello(){
        return "index";
    }
}
