package ru.mai.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {
    @GetMapping("/hello")
    public String helloPage() {
        System.out.println("Hello page is running...");
        return "first/hello";
    }

    @GetMapping("/bye")
    public String byePage() {
        System.out.println("Bye is running...");
        return "first/bye";
    }
}
