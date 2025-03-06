package com.Dominoes.DAO;

import com.Dominoes.model.dominoTile;

import java.util.List;

public class dominoTileDAO extends dominoTile implements IdominoTileDAO{

    private IdominoTileJPA idominoTileJPA;

    public dominoTileDAO(IdominoTileJPA idominoTileJPA) {
        this.idominoTileJPA = idominoTileJPA;
    }


    @Override
    public void saveTile(dominoTile dominoTile) {
        idominoTileJPA.save(dominoTile);
    }

    @Override
    public List<dominoTile> findAllTiles() {
        return idominoTileJPA.findAll();
    }


}
