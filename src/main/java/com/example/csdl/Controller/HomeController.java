package com.example.csdl.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class HomeController {
    @GetMapping
    public String home() {
        return "student";
    }
}
