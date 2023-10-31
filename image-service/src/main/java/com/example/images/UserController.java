package com.example.images;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import users.UserOuterClass;

@RestController
@Slf4j
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @GetMapping("/{userId}")
    public UserOuterClass.FindByUserIdResponse userInfo(@PathVariable("userId") Long id) {
        log.info("Get запрос на подробную информацию о пользователе - " );
        UserOuterClass.FindByUserIdResponse response= userService.calcScore();
        return response;
    }
}
