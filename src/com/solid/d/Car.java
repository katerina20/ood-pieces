package com.solid.d;

public class Car {

    private final Engine engine;
    private final Pedal pedal;
    private final Wheel wheel;

    public Car(Engine engine, Pedal pedal, Wheel wheel) {
        this.engine = engine;
        this.pedal = pedal;
        this.wheel = wheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public Pedal getPedal() {
        return pedal;
    }

    public Wheel getWheel() {
        return wheel;
    }
}
