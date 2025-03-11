package com.Dominoes.DAO;

import com.Dominoes.model.tile;
import com.Dominoes.model.tilePool;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItilePoolJPA extends JpaRepository<tilePool,Integer> {
}
