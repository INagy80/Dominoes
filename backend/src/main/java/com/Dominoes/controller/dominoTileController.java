package com.Dominoes.controller;

import com.Dominoes.model.dominoTile;
import com.Dominoes.service.dominoTileService;
import com.Dominoes.service.playerService;

import java.util.List;

public class dominoTileController {

    private dominoTileService Dservice;


    public dominoTileController(dominoTileService Dservice) {
        this.Dservice = Dservice;
    }

    public void saveTile(dominoTile dominoTile) {
        Dservice.saveTile(dominoTile);
    }
    public List<dominoTile> findAllTiles() {
        return Dservice.findAllTiles();
    }






}
