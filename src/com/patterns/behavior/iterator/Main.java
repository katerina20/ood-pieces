package com.patterns.behavior.iterator;

import com.patterns.behavior.iterator.model.*;
import com.patterns.behavior.iterator.recounter.Recounter;

public class Main {
    public static void main(String[] args) {
        Bouquet bouquet = new MyBouquet();
        Recounter recounter = bouquet.createRecounter();
        while (recounter.hasNext()) {
            final Flower flower = (Flower)(recounter.next());
            System.out.println(flower.getName());
        }
    }
}
