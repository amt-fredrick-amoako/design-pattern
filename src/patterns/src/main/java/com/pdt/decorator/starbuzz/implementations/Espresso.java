package com.pdt.decorator.starbuzz.implementations;

import com.pdt.decorator.starbuzz.Beverage;

public class Espresso extends Beverage {
    public Espresso(){
        description = "Expresso";
    }
    @Override
    public double cost() {
        return 1.99;
    }
}

