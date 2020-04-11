package com.janeroad.repository;


import com.janeroad.entity.User;

public interface UserRepository {
    public User login(String username, String password);
}
