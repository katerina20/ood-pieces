package com.solid.i;

import com.solid.i.interfaces.FlowerPicker;

public class AssistantWorker implements FlowerPicker {
    @Override
    public void pickFlower() {
        System.out.println("Pick 3 times a day");
    }
}
