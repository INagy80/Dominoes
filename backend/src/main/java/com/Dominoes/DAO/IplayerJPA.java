package com.Dominoes.DAO;

import com.Dominoes.model.player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IplayerJPA extends JpaRepository<player, Integer> {


}
