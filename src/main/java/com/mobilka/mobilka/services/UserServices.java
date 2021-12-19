package com.mobilka.mobilka.services;

import com.mobilka.mobilka.entities.User;

import java.util.List;

public interface UserServices {
    List<User> getAllUsers();
    User getUserByEmail(String email);
    User addUser(User user);
    User getUser(Long id);
    User editUser(User user);
    void deleteUser(User user);
}
