package com.patterns.behavior.chain.processor;

import com.patterns.behavior.chain.Number;

public abstract class Processor {
    private Processor processor;

    public Processor(Processor processor){
        this.processor = processor;
    };

    public void process(Number request){
        if(processor != null)
            processor.process(request);
    };
}
