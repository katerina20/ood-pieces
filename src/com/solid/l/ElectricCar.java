package com.solid.l;

public class ElectricCar implements Car {

    public void turnOnEngine() {
        throw new AssertionError("No engine!");
    }

    public void accelerate() {
        System.out.println("+10 to power.");
    }
}
