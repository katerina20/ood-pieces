package com.patterns.structural.bridge.shape;

import com.patterns.structural.bridge.color.Color;

public class Circle extends Shape {

    public Circle(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.print("Circle with color ");
        color.applyColor();
    }
}
