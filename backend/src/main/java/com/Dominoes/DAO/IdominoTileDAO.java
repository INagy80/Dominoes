package com.Dominoes.DAO;

import com.Dominoes.model.dominoTile;

import java.util.List;

public interface IdominoTileDAO {



    void saveTile(dominoTile dominoTile);
    List<dominoTile> findAllTiles();



}
