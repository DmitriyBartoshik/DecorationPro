package com.epam.service;

import com.epam.model.entity.decor.Decor;

import java.util.List;

public interface Service {
    int weightCalculate();

    int costCalculate();

    List<Decor> sortedDecorByTransparency();

    List<Decor> sortedDecorByCostByTransparency();

    List<Decor> findStoneByTransparency(int min, int max);
}
