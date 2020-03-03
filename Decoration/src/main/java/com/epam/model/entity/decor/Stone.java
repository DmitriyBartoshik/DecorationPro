package com.epam.model.entity.decor;

import com.epam.model.entity.enums.DecorateOrigin;
import com.epam.model.entity.enums.StoneType;

public class Stone extends Decor {
    private final StoneType stoneType;

    public Stone(int weight, int cost,
                 int transparency, DecorateOrigin origin, StoneType stoneType) {
        super(weight, cost, transparency, origin);
        this.stoneType = stoneType;
    }

    public StoneType getStoneType() {
        return stoneType;
    }
}
