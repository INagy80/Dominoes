package com.Dominoes.services;

import com.Dominoes.DAO.profileDAO;
import com.Dominoes.exception.userNotFoundException;
import com.Dominoes.model.profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class profileService {

    // Objekt erstellt
    private final profileDAO profileDAO;

    public profileService(profileDAO profileDAO) {
        this.profileDAO = profileDAO;
    }

    public List<profile> getAllProfiles() {
        return profileDAO.getAllProfiles();
    }


    public profile getProfileById(Integer id) {
        return profileDAO.getProfileById(id).orElseThrow(
                () -> new userNotFoundException("this profile does not exist")
        );
    }
}
