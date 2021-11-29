package com.users;

import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("management/api/v1/users/")
public class UserManagementController {
    private static final List<user> USERS = Arrays.asList(
            new user(1, "Adesanya David"),
            new user(2, "Ezeh Camson"),
            new user(3, "Fiewor John")
    );

    @GetMapping
    public static List<user> getUSERS() {
        System.out.println("getUSERS");
        return USERS;
    }

    @PostMapping
    public void addNewUser(@RequestBody User user){
        System.out.println("addNewUser");
        System.out.println(user);
    }

    @DeleteMapping(path = "{userId}" )
    public void deleteUser(@PathVariable("userId") Integer userId){
        System.out.println("deleteUser");
        System.out.println(userId);
    }

    @PutMapping(path = "{userId}")
    public void updateUser(@PathVariable("userId") Integer userId, @RequestBody User user){
        System.out.println(String.format("%s %S", userId, user));
    }
}
