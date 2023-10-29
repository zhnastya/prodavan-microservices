package com.example.user.service;

import com.example.user.model.User;

public interface UserService {
    Long createUser(User user);
    User findById(Long id);
}
