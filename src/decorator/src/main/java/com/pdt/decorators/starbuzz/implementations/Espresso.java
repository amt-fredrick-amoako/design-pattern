package com.pdt.decorators.starbuzz.implementations;

import com.pdt.decorators.starbuzz.Beverage;

public class Espresso extends Beverage {
    public Espresso(){
        description = "Expresso";
    }
    @Override
    public double cost() {
        return 1.99;
    }
}

