package com.example.csdl.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class Home {
    @GetMapping
    public String GetHomePage(){
        return "home";
    }
}
