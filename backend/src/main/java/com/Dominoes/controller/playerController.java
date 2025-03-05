package com.Dominoes.controller;

import com.Dominoes.model.player;
import com.Dominoes.service.playerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class playerController {

    private playerService playerService;


    public playerController(playerService playerService) {
        this.playerService = playerService;
    }


    public void createPlayer(player player) {
        playerService.createPlayer(player);
    }
    public player findPlayerById(int idP) {
        return playerService.findById(idP);
    }
    @GetMapping("v1/Players")
    public List<player> findAllPlayers() {
        return playerService.findAllPlayers();
    }


}
