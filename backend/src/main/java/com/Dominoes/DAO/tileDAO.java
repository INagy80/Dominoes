package com.Dominoes.DAO;

import com.Dominoes.model.tile;

import java.util.List;

public class tileDAO extends tile implements IdominoTileDAO{

    private IdominoTileJPA idominoTileJPA;

    public tileDAO(IdominoTileJPA idominoTileJPA) {
        this.idominoTileJPA = idominoTileJPA;
    }


    @Override
    public void saveTile(tile tile) {
        idominoTileJPA.save(tile);
    }

    @Override
    public List<tile> findAllTiles() {
        return idominoTileJPA.findAll();
    }


}
