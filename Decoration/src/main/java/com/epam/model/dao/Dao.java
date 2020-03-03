package com.epam.model.dao;

import com.epam.model.entity.decor.Decor;

import java.util.List;

public interface Dao {
    List<Decor> receiveAll();

    void add(Decor decor);
}
