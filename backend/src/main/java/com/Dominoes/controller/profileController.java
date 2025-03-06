package com.Dominoes.controller;
import com.Dominoes.services.profileService;

public class profileController {

    // Objekt erstellt
    private final profileService profileService;

    //Konstruktor
    public profileController(profileService profileService) {
        this.profileService = profileService;
    }

}
