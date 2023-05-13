package org.example.controllers;

import org.example.models.User;
import org.example.models.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistrationController {
    private final UserRepository userRepository;

    public RegistrationController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/registration")
    public String registration() {
        return "registration";
    }

    @PostMapping("/registration")
    public String register(
            @RequestParam String login,
            @RequestParam String password,
            @RequestParam String confirmPassword,
            @RequestParam String mail,
            @RequestParam String phoneNumber,
            Model model
    ) {
//        if (!password.equals(confirmPassword)) {
//            model.addAttribute("error", "Пароли не совпадают");
//            return "error";
//        }
        User user = new User();
        user.setLogin(login);
        user.setPassword(password);
        user.setMail(mail);
        user.setPhoneNumber(phoneNumber);
        userRepository.save(user);

        model.addAttribute("login", login);
        return "user";
    }
}
