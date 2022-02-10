package com.patterns.creational.factory.model;

public class Parrot implements Animal{
    private static final String KO = "Ko";

    @Override
    public void sound() {
        System.out.println(KO);
    }
}
