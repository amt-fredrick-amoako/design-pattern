package com.pdt.decorators.starbuzz.decorators;

import com.pdt.decorators.starbuzz.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public abstract String getDescription();
}
