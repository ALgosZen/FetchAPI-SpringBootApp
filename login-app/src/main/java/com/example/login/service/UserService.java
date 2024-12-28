package com.example.login.service;

import com.example.login.model.User;
import com.example.login.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public boolean validateUser(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, password) != null;
    }
}
