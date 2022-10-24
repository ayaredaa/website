package com.example.web;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController
{
    @GetMapping("/greeting")
    String getHello(Model model)
    {
        model.addAttribute("something", "welcome to our website");
        return"hello";
    }

}
