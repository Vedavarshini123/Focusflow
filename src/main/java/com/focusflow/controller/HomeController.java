package com.focusflow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/tasks")
    public String tasks() {
        return "tasks";
    }

    @GetMapping("/focus")
    public String focus() {
        return "focus";
    }

    @GetMapping("/profile")
    public String profile() {
        return "profile";
    }
}