package com.Dominoes.DAO;

import com.Dominoes.model.mUser;
import org.springframework.stereotype.Repository;

import java.util.List;
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
    public List<mUser> getAllUsers() {
        return userJPA.findAll();
    }

    @Override
    public Optional<mUser> getUserById(Integer id) {
        return userJPA.findById(id);
    }

    @Override
    public void insertUser(mUser user) {
        userJPA.save(user);

    }

    @Override
    public boolean existsUserByEmail(String email) {
        return userJPA.existsByEmail(email);
    }

    @Override
    public boolean existsUserByUsername(String username) {
        return userJPA.existsByUsername(username);
    }


}
