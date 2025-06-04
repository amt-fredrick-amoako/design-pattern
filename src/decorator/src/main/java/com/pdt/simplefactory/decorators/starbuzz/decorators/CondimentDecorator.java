package com.pdt.simplefactory.decorators.starbuzz.decorators;

import com.pdt.simplefactory.decorators.starbuzz.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public enum BeverageType{
        GRANDE, TALL, VENTI
    }
    Beverage beverage;

    public abstract String getDescription();
}
