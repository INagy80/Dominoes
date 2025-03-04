package com.Dominoes.DAO;

import com.Dominoes.model.user;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// Interface IuserJPA wurde mit database verkoppelt
public interface IuserJPA extends JpaRepository<user, Integer> {

}
