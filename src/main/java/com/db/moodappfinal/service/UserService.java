package com.db.moodappfinal.service;

import com.db.moodappfinal.repository.UserRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public List<com.db.moodappfinal.model.User> listAll() {
        return userRepository.findAll();
    }
    public User getById(Long id) {
        return userRepository.findUserByUserID(id).get();
    }



    public void updateUser(Long id, User user) {
        user.setId(id);
        userRepository.save(user);
    }
}