package com.Dominoes.controller;

import com.Dominoes.model.mUser;
import com.Dominoes.services.userService;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
public class userController {

    // Objekt erstellt
    private final userService userService;


    //Konstruktor
    public userController(userService userService) {
        this.userService = userService;
    }


    //getting all users
    @GetMapping("v1/users")
    public List<mUser> getUsers() {
        return userService.getAllUsers();
    }

    //geting user by Id
    @GetMapping("v1/users/{userId}")
    public mUser getUser(
            @PathVariable("userId") Integer userId) {

      return userService.getUser(userId);
    }

    @PostMapping("v1/register")
    public void registerUser(@RequestBody mUser user) {
        userService.addUser(user);
    }



}
