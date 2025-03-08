package com.Dominoes.controller;

import com.Dominoes.model.profile;
import com.Dominoes.model.userHistory;
import com.Dominoes.services.userHistoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userHistoryController {

    private final userHistoryService historyService;

    public userHistoryController(userHistoryService historyService) {
        this.historyService = historyService;

    }

    //geting userHistory by Id
    @GetMapping("v1/users/{profileID}/userHistory/")
    public userHistory getProfileByID(
            @PathVariable("profileId") Integer profileId) {

        return historyService.findById(profileId);
    }
}
