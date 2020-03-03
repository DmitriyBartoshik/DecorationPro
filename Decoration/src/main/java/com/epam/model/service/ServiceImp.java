package com.epam.model.service;

import com.epam.model.dao.Dao;
import com.epam.model.entity.decor.Decor;
import com.epam.model.entity.decor.Stone;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ServiceImp implements Service {
    private Dao dao;

    public ServiceImp(Dao dao) {
        this.dao = dao;
    }

    @Override
    public int weightCalculate() {
        return dao.receiveAll()
                .stream()
                .mapToInt(Decor::getWeight).sum();
    }

    @Override
    public int costCalculate() {
        return dao.receiveAll()
                .stream()
                .mapToInt(Decor::getCost).sum();
    }

    @Override
    public List<Decor> sortedDecorByTransparency() {
        return dao.receiveAll().stream().sorted(Comparator.comparing(Decor::getTransparency)).collect(Collectors.toList());
    }

    @Override
    public List<Decor> sortedDecorByCostByTransparency() {
        return dao.receiveAll().stream().sorted(Comparator.comparing(Decor::getCost).thenComparing(Decor::getTransparency)).collect(Collectors.toList());
    }

    @Override
    public List<Decor> findStoneByTransparency(int min, int max) {
        return dao.receiveAll().stream()
                .filter(decor -> decor instanceof Stone)
                .filter(decor -> decor.getTransparency() >= min && decor.getTransparency() <= max)
                .collect(Collectors.toList());
    }
}
