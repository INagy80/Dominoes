package com.Dominoes.services;

import com.Dominoes.DAO.userHistoryDAO;
import com.Dominoes.exception.userNotFoundException;
import com.Dominoes.model.userHistory;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class userHistoryService {

    private final userHistoryDAO userHistoryDAO;

    public userHistoryService(com.Dominoes.DAO.userHistoryDAO userHistoryDAO) {
        this.userHistoryDAO = userHistoryDAO;
    }

    public userHistory findById(Integer id) {
        return userHistoryDAO.findById(id).orElseThrow(
                () -> new userNotFoundException("userHistory with id " + id + " not found")
        );
    }
}

