package com.janeroad.repository;


import com.janeroad.entity.Admin;

public interface AdminRepository {
    public Admin login(String username, String password);
}
