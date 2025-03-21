package com.duynguyen.driving.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class DrivingController {

    @GetMapping("/")
    public String homePage() {
        return "index";
    }
}