package com.solid.i;

import com.solid.i.interfaces.FlowerPlanter;
import com.solid.i.interfaces.FlowerWaterer;

public class ChiefWorker implements FlowerPlanter, FlowerWaterer {

    @Override
    public void plantFlower() {
        System.out.println("Plant 2 days a week");
    }

    @Override
    public void waterFlower() {
        System.out.println("Water once a day");
    }
}
