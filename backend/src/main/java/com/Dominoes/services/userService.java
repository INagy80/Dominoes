package com.Dominoes.services;

import com.Dominoes.DAO.userDAO;
import com.Dominoes.exception.duplicatResourceException;
import com.Dominoes.exception.userNotFoundException;
import com.Dominoes.model.mUser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userService {

    // Objekt erstellt
    private final userDAO userDAO;

    //Konstruktor
    public userService(userDAO userDAO) {
        this.userDAO = userDAO;
    }

    public List<mUser> getAllUsers() {
        return userDAO.getAllUsers();

    }

    public mUser getUser(Integer id) {
        return userDAO.getUserById(id).orElseThrow(
                () -> new userNotFoundException("This user does not exist"));
    }

    public void addUser(mUser user) {
        //check if email or username already exists
        if (userDAO.existsUserByEmail(user.getEmail())) {
            throw new duplicatResourceException("This email already exists");
        } else if (userDAO.existsUserByUsername(user.getUsername())) {
            throw new duplicatResourceException("This username already exists");

            //add
        }else{

            userDAO.insertUser(user);


        }

    }
}
