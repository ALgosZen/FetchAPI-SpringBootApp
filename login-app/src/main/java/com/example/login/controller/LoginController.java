package com.example.login.controller;

import com.example.login.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {

    @GetMapping
    public ResponseEntity<String> handleGetRequest() {
        return ResponseEntity.ok("Please use POST to submit login credentials.");
    }
    // POST Mapping to handle login requests
    @PostMapping
    public ResponseEntity<String> login(@RequestBody User user) {
        // Example login logic
        if ("testuser".equals(user.getUsername()) && "testpassword".equals(user.getPassword())) {
            return ResponseEntity.ok("Login successful");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
        }
    }
}
