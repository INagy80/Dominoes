package com.Dominoes.DAO;

import com.Dominoes.model.mUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IuserJPA extends JpaRepository<mUser, Integer> {


    boolean existsByUsername(String username);
    boolean existsByEmail(String email);

}
