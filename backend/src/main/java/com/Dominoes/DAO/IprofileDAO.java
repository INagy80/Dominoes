package com.Dominoes.DAO;

import com.Dominoes.model.profile;
import com.Dominoes.model.user;

import java.util.Optional;

public interface IprofileDAO {
    Optional<profile> getprofileById(Integer id);

    Optional<profile> getAllProfiles();

    Optional<profile> getProfileById(Integer id);
    Optional<profile> getAllprofiles();
    Optional<profile> getAllFriends();
}
