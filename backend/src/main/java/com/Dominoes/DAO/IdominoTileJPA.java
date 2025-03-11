package com.Dominoes.DAO;

import com.Dominoes.model.tile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IdominoTileJPA extends JpaRepository<tile, Integer> {

}
