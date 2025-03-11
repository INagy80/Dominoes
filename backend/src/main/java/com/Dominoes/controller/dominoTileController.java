package com.Dominoes.controller;

import com.Dominoes.model.tile;
import com.Dominoes.service.dominoTileService;

import java.util.List;

public class dominoTileController {

    private dominoTileService Dservice;


    public dominoTileController(dominoTileService Dservice) {
        this.Dservice = Dservice;
    }

    public void saveTile(tile tile) {
        Dservice.saveTile(tile);
    }
    public List<tile> findAllTiles() {
        return Dservice.findAllTiles();
    }






}
