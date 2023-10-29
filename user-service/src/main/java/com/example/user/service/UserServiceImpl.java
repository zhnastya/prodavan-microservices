package com.example.user.service;

import com.example.user.model.User;
import com.example.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    @Override
    public Long createUser(User user) {
        return userRepository.save(user).getId();
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id)
                .orElseThrow();
    }

}
