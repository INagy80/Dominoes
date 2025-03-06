package com.Dominoes.services;

import com.Dominoes.DAO.profileDAO;
import com.Dominoes.model.profile;

public class profileService {

    // Objekt erstellt
    private final profileDAO profileDAO;

    public profileService(profileDAO profileDAO) {
        this.profileDAO = profileDAO;
    }

    public profile getProfileById(Integer id) {
        return profileDAO.getProfileById(id).orElse(null);
    };
}
