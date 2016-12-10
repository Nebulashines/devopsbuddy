package com.devopsbuddy.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by aropj on 12/10/2016.
 */
@Controller
public class CopyController {
    @RequestMapping("/about")
    public String about() {
        return "copy/about";
    }
}
