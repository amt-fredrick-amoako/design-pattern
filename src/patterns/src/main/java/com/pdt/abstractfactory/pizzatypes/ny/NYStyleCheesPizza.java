package com.pdt.abstractfactory.pizzatypes.ny;

import com.pdt.abstractfactory.Pizza;

public class NYStyleCheesPizza extends Pizza {
    public NYStyleCheesPizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }

//    @Override
//    public void prepare() {
//
//    }
//
//    @Override
//    public void bake() {
//
//    }
//
//    @Override
//    public void cut() {
//
//    }
//
//    @Override
//    public void box() {
//
//    }
}
