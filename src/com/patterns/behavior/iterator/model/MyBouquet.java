package com.patterns.behavior.iterator.model;

import com.patterns.behavior.iterator.recounter.FlowerRecounter;
import com.patterns.behavior.iterator.recounter.Recounter;

public class MyBouquet implements Bouquet {

    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    Flower[] flowers;

    public MyBouquet()
    {
        flowers = new Flower[MAX_ITEMS];

        // Let us add some dummy notifications
        addItem("Rose 1");
        addItem("Chamomile");
        addItem("Rose 2");
    }

    public void addItem(String str)
    {
        Flower flower = new Flower(str);
        if (numberOfItems >= MAX_ITEMS)
            System.err.println("Full");
        else
        {
            flowers[numberOfItems] = flower;
            numberOfItems = numberOfItems + 1;
        }
    }

    public Recounter createRecounter()
    {
        return new FlowerRecounter(flowers);
    }
}
