package com.Dominoes.services;
import com.Dominoes.DAO.playerDAO;
import com.Dominoes.exception.duplicatResourceException;
import com.Dominoes.exception.userNotFoundException;
import com.Dominoes.model.player;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class playerService {

    private final playerDAO dao;

    public playerService(playerDAO dao) {
        this.dao = dao;
    }

    public void createPlayer(player player) {
        //check if username already exists
        if (dao.existsUserByUsername(player.getName())) {
            throw new duplicatResourceException("This username already exists");

            //add
        }else{

            dao.createPlayer(player);


        }

    }

    public player findById(Integer id) {
        return dao.findById(id).orElseThrow(
                ()->  new userNotFoundException("This player does not exist")
        );
    }
    public List<player> findAllPlayers() {
        return dao.findAllPlayers();
    }
}
