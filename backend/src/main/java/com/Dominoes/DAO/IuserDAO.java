package com.Dominoes.DAO;
import java.util.List;
import java.util.Optional;

import com.Dominoes.model.mUser;
import org.springframework.stereotype.Repository;


// aufrufbar methoden
@Repository
public interface IuserDAO {
    List<mUser> getAllUsers();
    Optional<mUser> getUserById(Integer id);
    void insertUser(mUser user);
    boolean existsUserByEmail(String email);
    boolean existsUserByUsername(String username);


}
