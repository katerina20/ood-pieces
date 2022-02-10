package com.patterns.creational.factory.model;

public class Dog implements Animal {
    private static final String GAV = "Gav";

    @Override
    public void sound() {
        System.out.println(GAV);
    }
}
