package com.pdt.decorator.starbuzz.implementations;

import com.pdt.decorator.starbuzz.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend(){
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
