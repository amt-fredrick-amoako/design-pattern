package com.pdt.decorator.starbuzz.implementations;

import com.pdt.decorator.starbuzz.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast";
    }
    @Override
    public double cost() {
        return 0.99;
    }
}
