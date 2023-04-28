package org.example.controllers;

import org.example.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    private final String login = "ivan228";
    private final String password = "1234";
    @PostMapping("/user")
    public String user(@ModelAttribute User user, Model model) {
        if (user.getLogin().equals(this.login) && user.getPassword().equals(this.password)) {
            model.addAttribute("user", user);
            return "user";
        } else {
            model.addAttribute("user", new User());
            model.addAttribute("error", "Login or password is invalid!");
            return "login";
        }
    }
}
