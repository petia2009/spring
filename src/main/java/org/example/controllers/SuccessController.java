package org.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SuccessController {
    @GetMapping("/")
    public String login() {
        return "error";
    }
}