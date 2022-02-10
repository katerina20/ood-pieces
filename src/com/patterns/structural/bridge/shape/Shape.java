package com.patterns.structural.bridge.shape;

import com.patterns.structural.bridge.color.Color;

public abstract class Shape {
    protected Color color;

    public Shape(Color c){
        this.color=c;
    }

    abstract public void applyColor();
}
