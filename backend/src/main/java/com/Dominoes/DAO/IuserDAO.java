package com.Dominoes.DAO;

import com.Dominoes.model.user;

import java.util.Optional;

// zwei methoden wurde aufgerufen
public interface IuserDAO {
    Optional<user> getUserById(Integer id);
    Optional<user> getallusers();
}
