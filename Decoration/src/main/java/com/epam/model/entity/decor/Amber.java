package com.epam.model.entity.decor;


import com.epam.model.entity.enums.AmberType;
import com.epam.model.entity.enums.DecorateOrigin;

public class Amber extends Decor {
    private final AmberType amberType;

    public Amber(int weight, int cost,
                 int transparency, DecorateOrigin origin, AmberType amberType) {
        super(weight, cost, transparency, origin);
        this.amberType = amberType;
    }

    public AmberType getAmberType() {
        return amberType;
    }
}
