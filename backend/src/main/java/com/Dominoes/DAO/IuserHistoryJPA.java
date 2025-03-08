package com.Dominoes.DAO;

import com.Dominoes.model.userHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IuserHistoryJPA extends JpaRepository<userHistory, Integer> {
}
