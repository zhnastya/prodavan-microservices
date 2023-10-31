package com.example.user.service;

import com.example.user.model.User;

import java.security.Principal;
import java.util.List;
import java.util.Map;

public interface UserService {
    Long createUser(User user);

    User updateUser(User user);

    boolean deleteUser(Principal principal);

//    void addAvatar(Principal user, MultipartFile file);

    List<User> getUsers();

    User getUserByEmail(String email);
    User getUserById(Long id);

    void blockUser(Long id);

    void changeUserRole(User user, Map<String, String> form);
}
