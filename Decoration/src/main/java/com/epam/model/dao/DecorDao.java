package com.epam.model.dao;

import com.epam.model.entity.decor.Decor;

import java.util.List;

public class DecorDao implements Dao {
    private List<Decor> decors;

    private DecorDao(Builder builder) {
        this.decors = builder.decors;
    }

    public List<Decor> getDecors() {
        return decors;
    }

    @Override
    public List<Decor> receiveAll() {
        return decors;
    }

    @Override
    public void add(Decor decor) {
        decors.add(decor);
    }

    public static class Builder {
        private List<Decor> decors;

        public Builder setDecors(List<Decor> decors) {
            this.decors = decors;
            return this;
        }

        public DecorDao build() {
            return new DecorDao(this);
        }
    }
}
