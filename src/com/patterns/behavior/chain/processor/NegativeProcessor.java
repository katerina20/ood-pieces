package com.patterns.behavior.chain.processor;

import com.patterns.behavior.chain.Number;

public class NegativeProcessor extends Processor{

    public NegativeProcessor(Processor processor){
        super(processor);
    }

    public void process(Number request)
    {
        if (request.getNumber() < 0)
            System.out.println("NegativeProcessor : " + request.getNumber());
        else super.process(request);
    }
}
