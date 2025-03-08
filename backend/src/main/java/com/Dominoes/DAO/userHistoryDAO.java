package com.Dominoes.DAO;

import com.Dominoes.model.userHistory;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class userHistoryDAO implements IuserHistoryDAO {

    private final IuserHistoryJPA userHistoryJPA;

    public userHistoryDAO(IuserHistoryJPA userHistoryJPA) {
        this.userHistoryJPA = userHistoryJPA;
    }

    @Override
    public Optional<userHistory> findById(Integer id) {
        return userHistoryJPA.findById(id);
    }
}
