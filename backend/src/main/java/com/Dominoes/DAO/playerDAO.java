package com.Dominoes.DAO;

import com.Dominoes.model.player;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class playerDAO implements IplayerDAO{

    private final IplayerJPA playerJPA;

    public playerDAO(IplayerJPA playerJPA) {
        this.playerJPA = playerJPA;
    }

    @Override
    public Optional<player> findById(Integer id) {
        return playerJPA.findById(id);
    }

    @Override
    public void createPlayer(player player) {
        playerJPA.save(player);
    }

    @Override
    public List<player> findAllPlayers() {
        return playerJPA.findAll();
    }

    @Override
    public boolean existsUserByUsername(String username) {
        return playerJPA.existsByUsername(username);
    }
}
