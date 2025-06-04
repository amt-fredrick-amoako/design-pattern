package com.pdt.simplefactory.decorators.starbuzz.implementations;

import com.pdt.simplefactory.decorators.starbuzz.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend(){
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
