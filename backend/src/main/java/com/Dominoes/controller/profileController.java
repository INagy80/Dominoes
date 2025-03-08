package com.Dominoes.controller;


import com.Dominoes.model.profile;
import com.Dominoes.services.profileService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class profileController {

    // Objekt erstellt
    private final profileService profileService;

    //Konstruktor
    public profileController(profileService profileService) {
        this.profileService = profileService;
    }

    //getting all users
    @GetMapping("v1/users/profiles")
    public List<profile> getAllProfiles() {
        return profileService.getAllProfiles();
    }

    //geting user by Id
    @GetMapping("v1/users/profiles/{profileId}")
    public profile  getProfileByID(
            @PathVariable("profileId") Integer profileId) {

        return profileService.getProfileById(profileId);
    }
}
