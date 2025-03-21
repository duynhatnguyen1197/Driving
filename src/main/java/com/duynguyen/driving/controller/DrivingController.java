package com.duynguyen.driving.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DrivingController {
    @GetMapping("/")
    public String homePage() {
        return "index"; // Returns index.html from src/main/resources/templates
    }
}