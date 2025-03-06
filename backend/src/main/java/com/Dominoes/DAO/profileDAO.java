package com.Dominoes.DAO;

import com.Dominoes.model.profile;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class profileDAO implements IprofileDAO {


    // Objekt erstellt
    private final IprofileJPA iprofileJPA;

    //Konstruktor
    public profileDAO(IprofileJPA profileJPA) {
        this.iprofileJPA = profileJPA;
    }

    @Override
    public Optional<profile> getprofileById(Integer id) {
        return iprofileJPA.findById(id);
    }

    @Override
    public Optional<profile> getAllProfiles() {
        return getAllProfiles();
    }

    @Override
    public Optional<profile> getProfileById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Optional<profile> getAllprofiles() {
        return Optional.empty();
    }


    @Override
    public Optional<profile> getAllFriends() {

        return Optional.empty();
    }
}