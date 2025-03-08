package com.Dominoes.DAO;

import com.Dominoes.model.profile;

import java.util.List;
import java.util.Optional;

public interface IprofileDAO {
    List<profile> getAllProfiles();
    Optional<profile> getProfileById(Integer id);

}
