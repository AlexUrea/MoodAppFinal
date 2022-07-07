package com.db.moodappfinal.repository;

import com.db.moodappfinal.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, String> {
    User findUserByUsername(String username);

    User findUserByEmail(String email);

    User findUserByUserID(String userID);


}