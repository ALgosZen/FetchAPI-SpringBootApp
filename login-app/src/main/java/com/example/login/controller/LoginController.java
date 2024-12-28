package com.example.login.controller;

import com.example.login.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/login")
public class LoginController {

    @PostMapping
    public String login(@RequestBody User user) {
        // Lombok-generated getters can be used here
        String username = user.getUsername();
        String password = user.getPassword();

        // Basic logic to simulate login validation
        if ("admin".equals(username) && "password".equals(password)) {
            return "Login successful!";
        } else {
            return "Invalid credentials!";
        }
    }
}
