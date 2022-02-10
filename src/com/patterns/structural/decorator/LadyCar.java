package com.patterns.structural.decorator;

public class LadyCar extends CarDecorator {

    public LadyCar(Car c) {
        super(c);
    }

    @Override
    public void assemble(){
        super.assemble();
        System.out.print(" Adding Lady color.");
    }
}
