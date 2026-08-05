package com.app.segumed.controllers;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Welcome to the SeguMed API!";
    }
}
