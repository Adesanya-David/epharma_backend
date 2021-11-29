package com.users;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/v1/users")

public class UserController {
    private static final List<user>USERS = Arrays.asList(
            new user(1, "Adesanya David"),
            new user(2, "Ezeh Camson"),
            new user(3, "Fiewor John")
    );

    @GetMapping(path = "/{userId}")
    public user getUser(@PathVariable("userId") Integer userId) {
        return USERS.stream()
                .filter(user -> userId.equals(user.getUserId()))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("User" + userId + "doesn't exist"));

    }
}
