package com.patterns.behavior.iterator.recounter;

import com.patterns.behavior.iterator.model.Flower;

public class FlowerRecounter implements Recounter{
    Flower[] flowers;

    int pos = 0;

    public  FlowerRecounter (Flower[] flowers)
    {
        this.flowers = flowers;
    }

    public Object next()
    {
        Flower notification =  flowers[pos];
        pos += 1;
        return notification;
    }

    public boolean hasNext()
    {
        return pos < flowers.length && flowers[pos] != null;
    }
}
