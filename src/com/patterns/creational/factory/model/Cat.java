package com.patterns.creational.factory.model;

public class Cat implements Animal {
    private static final String MYAU = "Myau";

    @Override
    public void sound() {
        System.out.println(MYAU);
    }
}
