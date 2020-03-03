package com.epam.controller;

import com.epam.model.entity.decor.Decor;
import com.epam.model.service.Service;

import java.util.List;

public class Controller {
    private Service service;

    public Controller(Service service) {
        this.service = service;
    }

    public int weightCalculate() {
        return service.weightCalculate();
    }

    public int costCalculate() {
        return service.weightCalculate();
    }

    public List<Decor> sortedDecorByTransparency() {
        return service.sortedDecorByTransparency();
    }

    public List<Decor> sortedDecorByCostByTransparency() {
        return service.sortedDecorByCostByTransparency();
    }

    public List<Decor> findStoneByTransparency(int min, int max) {
        return service.findStoneByTransparency(min, max);
    }
}
