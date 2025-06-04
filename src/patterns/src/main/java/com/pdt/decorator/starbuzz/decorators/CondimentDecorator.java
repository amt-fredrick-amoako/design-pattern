package com.pdt.decorator.starbuzz.decorators;

import com.pdt.decorator.starbuzz.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public enum BeverageType{
        GRANDE, TALL, VENTI
    }
    Beverage beverage;

    public abstract String getDescription();
}
