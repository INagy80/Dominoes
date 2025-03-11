package com.Dominoes.services;

import com.Dominoes.DAO.tileDAO;
import com.Dominoes.model.tile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class dominoTileService {

    private final tileDAO dao;

    public dominoTileService(tileDAO Ddao) {
        this.dao = Ddao;
    }



    public void saveTile(tile tile) {
        dao.saveTile(tile);
    }

    public List<tile> findAllTiles() {
        return dao.findAllTiles();
    }




}
