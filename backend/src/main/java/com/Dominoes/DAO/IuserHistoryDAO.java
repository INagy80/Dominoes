package com.Dominoes.DAO;

import com.Dominoes.model.userHistory;

import java.util.Optional;

public interface IuserHistoryDAO {
    Optional<userHistory> findById(Integer id);
}
