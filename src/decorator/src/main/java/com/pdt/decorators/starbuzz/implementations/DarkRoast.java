package com.pdt.decorators.starbuzz.implementations;

import com.pdt.decorators.starbuzz.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast";
    }
    @Override
    public double cost() {
        return 0.99;
    }
}
