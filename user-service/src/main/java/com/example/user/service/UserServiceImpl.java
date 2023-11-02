package com.example.user.service;

import com.example.user.model.User;
import com.example.user.model.enums.Role;
import com.example.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.security.Principal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;


//    private Image toImageEntity(MultipartFile file) throws IOException {
//        Image avatar = new Image();
//        avatar.setName(file.getName());
//        avatar.setOriginalFileName(file.getOriginalFilename());
//        avatar.setContentType(file.getContentType());
//        avatar.setSize(file.getSize());
//        avatar.setBytes(file.getBytes());
//        return avatar;
//    }


    @Override
    public Long createUser(User user) {
        String userEmail = user.getEmail();
        if (userRepository.findByEmail(userEmail) != null) return null;
        user.setActive(true);
        user.setRoles(Set.of(Role.ROLE_USER));
        user.setPassword(user.getPassword());
//        user.setAvatar(null);
        User user1 =  userRepository.save(user);
        return user1.getId();
    }


    @Override
    public User updateUser(User user) {
        String userEmail = user.getEmail();
        User user1 = userRepository.findByEmail(userEmail);
        if (user1 == null) return null;
        return userRepository.save(user);
    }

    @Override
    public boolean deleteUser(Principal principal) {
        User user1 = userRepository.findByEmail(principal.getName());
        if (user1 == null) return false;
        userRepository.deleteById(user1.getId());
        return true;
    }

//    @Override
//    @SneakyThrows
//    public void addAvatar(Principal user, MultipartFile file) {
//        String userEmail = user.getName();
//        User user1 = userRepository.findByEmail(userEmail);
//        if (user1 != null) {
//            Image avatar = toImageEntity(file);
//            user1.setAvatar(avatar);
//            userRepository.save(user1);
//        }
//    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow();
    }

    @Override
    public void blockUser(Long id) {
        User user = userRepository.findById(id).orElse(null);
        if (user != null) {
            if (user.isActive()) {
                user.setActive(false);
            } else {
                user.setActive(true);
            }
        }
    }

    @Override
    public void changeUserRole(User user, Map<String, String> form) {
        Set<String> roles = Arrays.stream(Role.values())
                .map(Role::name)
                .collect(Collectors.toSet());
        user.getRoles().clear();
        for (String s : form.keySet()) {
            if (roles.contains(s)) {
                user.getRoles().add(Role.valueOf(s));
            }
        }
        userRepository.save(user);
    }

}
