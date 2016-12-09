package com.devopsbuddy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by aropj on 12/8/2016.
 */
@Controller
public class HelloWorldController {
    @RequestMapping("/")
    public String sayHello() {
        return "index";
    }
}
