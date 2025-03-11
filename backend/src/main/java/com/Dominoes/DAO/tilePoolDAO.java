package com.Dominoes.DAO;

import com.Dominoes.model.tile;
import com.Dominoes.model.tilePool;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class tilePoolDAO implements ItilePoolDAO {
    private final ItilePoolJPA tilePoolJPA;

    public tilePoolDAO(ItilePoolJPA tilePoolJPA) {
        this.tilePoolJPA = tilePoolJPA;
    }

    @Override
    public Optional<tilePool> getTilePool(Integer id) {
        return tilePoolJPA.findById(id);
    }
}
