package com.Dominoes.controller;
import com.Dominoes.DAO.IuserJPA;
import com.Dominoes.DAO.userDAO;
import com.Dominoes.services.userService;
import com.Dominoes.model.user;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userController {

    // Objekt erstellt
    private final userService userService;


    //Konstruktor
    public userController(userService userService) {
        this.userService = userService;
    }






}

