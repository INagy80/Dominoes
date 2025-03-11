package com.Dominoes.controller;

import com.Dominoes.model.tile;
import com.Dominoes.services.dominoTileService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class dominoTileController {

    private final dominoTileService Dservice;


    public dominoTileController(dominoTileService Dservice) {
        this.Dservice = Dservice;
    }

    @PostMapping("v1/tile/create")
    public void saveTile(@RequestBody tile tile) {

        Dservice.saveTile(tile);
    }
    @GetMapping("v1/tiles")
    public List<tile> findAllTiles() {
        return Dservice.findAllTiles();
    }






}
