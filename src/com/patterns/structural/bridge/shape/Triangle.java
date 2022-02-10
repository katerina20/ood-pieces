package com.patterns.structural.bridge.shape;

import com.patterns.structural.bridge.color.Color;

public class Triangle extends Shape {

    public Triangle(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.print("Triangle with color ");
        color.applyColor();
    }
}
