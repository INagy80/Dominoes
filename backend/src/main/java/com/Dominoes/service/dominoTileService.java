package com.Dominoes.service;

import com.Dominoes.model.dominoTile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public class dominoTileService {

    private JpaRepository<dominoTile, Integer> dominoTileJpaRepository;

    public dominoTile findById(int idT) {
        return dominoTileJpaRepository.findById(idT).get();
    }
    public List<dominoTile> findAll() {
        return dominoTileJpaRepository.findAll();
    }
    public dominoTile save(dominoTile dominoTile) {
        return dominoTileJpaRepository.save(dominoTile);
    }

}
