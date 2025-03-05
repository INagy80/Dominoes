package com.Dominoes.service;

import com.Dominoes.DAO.playerDAO;
import com.Dominoes.model.player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class playerService {

    private playerDAO dao;

    public playerService(playerDAO dao) {
        this.dao = dao;
    }

    public void createPlayer(player player) {
         dao.createPlayer(player);
    }
    public player findById(int idP) {
        return dao.findById(idP).orElseThrow(
                ()->  new RuntimeException("this user not found")
        );
    }
    public List<player> findAllPlayers() {
        return dao.findAllPlayers();
    }
}
