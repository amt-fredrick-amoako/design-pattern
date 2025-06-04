package com.pdt.decorator.starbuzz.decorators;

import com.pdt.decorator.starbuzz.Beverage;

public class Soy extends CondimentDecorator{
    public Soy(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return beverage.cost() + .15;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
