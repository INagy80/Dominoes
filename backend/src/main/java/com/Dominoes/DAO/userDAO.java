package com.Dominoes.DAO;

import com.Dominoes.model.user;
import jakarta.persistence.Entity;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class userDAO implements IuserDAO {

    // Objekt erstellt
    private final IuserJPA userJPA;

    //Konstruktor
    public userDAO(IuserJPA userJPA) {
        this.userJPA = userJPA;
    }

    @Override
    public Optional<user> getUserById(Integer id) {
        return userJPA.findById(id);
    }

    @Override
    public Optional<user> getallusers() {
        return getallusers();
    }
}

