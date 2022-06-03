package com.example.restwildflyapp;

import java.util.List;

public interface UserEJB {
    List<User> findAll();
    User getUser(Long id);
    void register(User user);
    void update(Long id, User user);
}
