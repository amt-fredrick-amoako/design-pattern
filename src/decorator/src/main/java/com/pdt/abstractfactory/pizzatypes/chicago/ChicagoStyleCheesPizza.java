package com.pdt.abstractfactory.pizzatypes.chicago;

import com.pdt.abstractfactory.Pizza;

public class ChicagoStyleCheesPizza extends Pizza {
    public ChicagoStyleCheesPizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
