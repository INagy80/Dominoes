package com.Dominoes.DAO;
import com.Dominoes.model.profile;
import org.springframework.data.jpa.repository.JpaRepository;

// Interface IProfileJPA wurde mit database verkoppelt
public interface IprofileJPA extends JpaRepository <profile, Integer>{

}
