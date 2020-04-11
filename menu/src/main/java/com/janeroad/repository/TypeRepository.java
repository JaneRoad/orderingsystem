package com.janeroad.repository;


import com.janeroad.entity.Type;

import java.util.List;

public interface TypeRepository {
    public List<Type> findAll();
}
