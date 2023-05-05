package org.example.controllers;

import org.example.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistrationController {
    @GetMapping("/registration")
    public String login(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }
}
