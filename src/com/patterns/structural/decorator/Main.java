package com.patterns.structural.decorator;

public class Main {

    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();

        Car sportsLadyCar = new SportsCar(new LadyCar(new BasicCar()));
        sportsLadyCar.assemble();
    }
}
