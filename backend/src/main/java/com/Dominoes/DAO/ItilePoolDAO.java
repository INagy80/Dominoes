package com.Dominoes.DAO;

import com.Dominoes.model.tile;
import com.Dominoes.model.tilePool;

import java.util.List;
import java.util.Optional;

public interface ItilePoolDAO {

    Optional<tilePool> getTilePool(Integer id);


}
