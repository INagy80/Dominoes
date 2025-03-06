package com.Dominoes.service;

import com.Dominoes.DAO.IdominoTileDAO;
import com.Dominoes.DAO.dominoTileDAO;
import com.Dominoes.model.dominoTile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public class dominoTileService {

    private dominoTileDAO Ddao;

    public dominoTileService(dominoTileDAO Ddao) {
        this.Ddao = Ddao;
    }



    public void saveTile(dominoTile dominoTile) {
        Ddao.saveTile(dominoTile);
    }

    public List<dominoTile> findAllTiles() {
        return Ddao.findAllTiles();
    }




}
