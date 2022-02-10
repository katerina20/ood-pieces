package com.patterns.creational.builder;

import com.patterns.creational.builder.model.Flower;
import com.patterns.creational.builder.model.Season;

public class Main {

    public static void main(String[] args) {
        Flower flower = new Flower.Builder()
                .name("Chamomile")
                .genus("Matricaria")
                .tribe("Anthemideae")
                .country("Africa")
                .season(Season.SPRING)
                .leaves(5)
                .buds(3)
                .build();
    }
}
