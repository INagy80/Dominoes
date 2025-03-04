package com.Dominoes.services;
import com.Dominoes.DAO.IuserJPA;
import com.Dominoes.DAO.userDAO;
import com.Dominoes.model.user;
import org.springframework.stereotype.Service;

@Service
public class userService {

    // Objekt erstellt
    private final userDAO userDAO;

    //Konstruktor
    public userService(userDAO userDAO) {
        this.userDAO = userDAO;
    }
    public user getUserById(Integer id){
        return userDAO.getUserById(id).orElse(null);
    }

}
