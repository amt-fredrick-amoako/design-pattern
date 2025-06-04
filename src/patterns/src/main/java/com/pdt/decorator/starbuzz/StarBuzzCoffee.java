package com.pdt.decorator.starbuzz;

import com.pdt.decorator.starbuzz.decorators.Mocha;
import com.pdt.decorator.starbuzz.decorators.Soy;
import com.pdt.decorator.starbuzz.decorators.Whip;
import com.pdt.decorator.starbuzz.implementations.DarkRoast;
import com.pdt.decorator.starbuzz.implementations.Espresso;
import com.pdt.decorator.starbuzz.implementations.HouseBlend;

public class StarBuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + "$" + beverage.cost());
        Beverage beverage2 = new DarkRoast(); // make a dark roast object
        beverage2 = new Mocha(beverage2); // wrap dark roast with mocha
        beverage2 = new Mocha(beverage2); // wrap it in second mocha
        beverage2 = new Whip(beverage2); // wrap it in a whip
        System.out.println(beverage2.getDescription() +  "$" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3); // finally, give us a house blend with soy, mocha, and whip.
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);

        System.out.println(beverage3.getDescription() +  "$" + beverage3.cost());
    }

}
