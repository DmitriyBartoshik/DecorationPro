package com.epam.model.dao;

import com.epam.model.entity.decor.Decor;

import java.util.List;

public class DaoImp implements Dao {
    private List<Decor> decors;

    @Override
    public List<Decor> receiveAll() {
        return decors;
    }

    @Override
    public void add(Decor decor) {
        decors.add(decor);
    }
}
