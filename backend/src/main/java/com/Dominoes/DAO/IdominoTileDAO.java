package com.Dominoes.DAO;

import com.Dominoes.model.tile;

import java.util.List;

public interface IdominoTileDAO {



    void saveTile(tile tile);
    List<tile> findAllTiles();



}
