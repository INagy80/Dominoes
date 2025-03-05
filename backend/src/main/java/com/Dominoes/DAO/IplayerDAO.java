package com.Dominoes.DAO;

import com.Dominoes.model.player;

import java.util.List;
import java.util.Optional;

public interface IplayerDAO {

    Optional<player> findById(int idP);
    void createPlayer(player player);
    List<player> findAllPlayers();

}
