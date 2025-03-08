package com.Dominoes.DAO;

import com.Dominoes.model.game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IgameJPA extends JpaRepository<game,Integer> {
}
