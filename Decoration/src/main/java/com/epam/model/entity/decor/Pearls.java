package com.epam.model.entity.decor;


import com.epam.model.entity.enums.DecorateOrigin;
import com.epam.model.entity.enums.PearlsType;

public class Pearls extends Decor {
    private final PearlsType pearlsType;

    public Pearls(int weight, int cost,
                  int transparency, DecorateOrigin origin, PearlsType pearlsType) {
        super(weight,cost,transparency,origin);
        this.pearlsType = pearlsType;
    }

    public PearlsType getPearlsType() {
        return pearlsType;
    }
}
