package com.Dominoes.DAO;

import com.Dominoes.model.profile;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class profileDAO implements IprofileDAO {

    //JPA object als attribute
    private final IprofileJPA   profileJPA;

    //dependency injection constructor
    public profileDAO( IprofileJPA profileJPA) {
        this.profileJPA = profileJPA;

    }


    @Override
    public List<profile> getAllProfiles() {
        return profileJPA.findAll();
    }

    @Override
    public Optional<profile> getProfileById(Integer id) {
        return profileJPA.findById(id);
    }
}
