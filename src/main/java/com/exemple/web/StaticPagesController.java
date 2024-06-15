package com.exemple.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StaticPagesController {

    // serve static page
    @GetMapping("/About")
    public String getformat(){
        return "accessible/about";
    }

    // serve static page
    @GetMapping("/contact")
    public String getcontact(){return "/accessible/Contact";}

    // serve static page
    @GetMapping("/index")
    public String getsdmin() {
        return "/accessible/index";
    }

    // serve static page
    @GetMapping("/")
    public String getindex1() {
        return "accessible/page1";
    }
}
