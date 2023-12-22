package com.cooltour.cooltour.service;

import com.cooltour.cooltour.model.User;

import java.util.List;

public interface AuthService {
    User login(String username, String password);
    User register(String username, String password, String repeatPassword, String name, String surname, String email);
    List<User> findAll();

}
