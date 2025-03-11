package com.Dominoes.controller;

import com.Dominoes.model.player;
import com.Dominoes.services.playerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class playerController {

    private final playerService service;

    public playerController(playerService service) {
        this.service = service;
    }

    @GetMapping("v1/players")
    public List<player> getplayers() {
        return service.findAllPlayers();
    }

    //geting player by Id
    @GetMapping("v1/users/{playerId}")
    public player getplayer(
            @PathVariable("playerId") Integer playerId) {

        return service.findById(playerId);
    }

    @PostMapping("v1/player/create")
    public void registerUser(@RequestBody player player) {
        service.createPlayer(player);
    }

}
