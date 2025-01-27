package com.example.jdbctemplatedemo.service;

import com.example.jdbctemplatedemo.model.User;
import com.example.jdbctemplatedemo.repository.RegisterRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegisterService {

    private final RegisterRepository registerRepository;

    public void register(User user) {
        registerRepository.createUser(user);
    }
}
