package com.patterns.structural.bridge;

import com.patterns.structural.bridge.color.Blue;
import com.patterns.structural.bridge.color.Red;
import com.patterns.structural.bridge.shape.*;

public class Main {
    public static void main(String[] args) {
        Shape tri = new Triangle(new Red());
        tri.applyColor();

        Shape pent = new Circle(new Blue());
        pent.applyColor();
    }
}
