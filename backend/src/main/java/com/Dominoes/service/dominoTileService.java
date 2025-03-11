package com.Dominoes.service;

import com.Dominoes.DAO.tileDAO;
import com.Dominoes.model.tile;

import java.util.List;

public class dominoTileService {

    private tileDAO Ddao;

    public dominoTileService(tileDAO Ddao) {
        this.Ddao = Ddao;
    }



    public void saveTile(tile tile) {
        Ddao.saveTile(tile);
    }

    public List<tile> findAllTiles() {
        return Ddao.findAllTiles();
    }




}
