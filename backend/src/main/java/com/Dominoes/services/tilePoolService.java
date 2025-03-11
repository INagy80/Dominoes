package com.Dominoes.services;

import com.Dominoes.DAO.tilePoolDAO;
import com.Dominoes.exception.userNotFoundException;
import com.Dominoes.model.player;
import com.Dominoes.model.tilePool;
import org.springframework.stereotype.Service;

@Service
public class tilePoolService {

    private final tilePoolDAO tilePoolDAO;

    public tilePoolService(tilePoolDAO tilePoolDAO) {
        this.tilePoolDAO = tilePoolDAO;
    }

    public tilePool getTilePool(Integer id) {


            return tilePoolDAO.getTilePool(id).orElseThrow(
                    () -> new userNotFoundException("This tilePool does not exist"));
        }
}
