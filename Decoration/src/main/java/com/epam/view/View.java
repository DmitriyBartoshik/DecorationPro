package com.epam.view;

import com.epam.controller.Controller;
import com.epam.model.entity.decor.Decor;

import java.util.List;

public class View {
    private Controller controller;

    public View(Controller controller) {
        this.controller = controller;
    }

    public void weightCalculate() {
        double weight = controller.weightCalculate();
//        printValue("necklace weight", weight);
    }

    public void costCalculate() {
        int cost = controller.costCalculate();
//        printValue("necklace cost", cost);
    }

    public void sortedDecorByTransparency() {
        List<Decor> decors = controller.sortedDecorByTransparency();
//        printDecors(decors);
    }

    public void sortedDecorByCostByTransparency() {
        List<Decor> decors = controller.sortedDecorByCostByTransparency();
//        printDecors(decors);
    }

    public void findStoneByTransparency(int min, int max) {
        List<Decor> stones = controller.findStoneByTransparency(min, max);
//        printDecors(stones);
    }
}
