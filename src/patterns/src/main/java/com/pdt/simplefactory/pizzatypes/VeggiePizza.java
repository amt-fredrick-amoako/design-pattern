package com.pdt.simplefactory.pizzatypes;

import com.pdt.abstractfactory.Pizza;
import com.pdt.abstractfactory.ingredients.factory.contract.PizzaIngredientFactory;
import com.pdt.simplefactory.pizzastore.PizzaStore;

public class VeggiePizza extends Pizza {
    private final PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {

    }

    @Override
    public void bake() {

    }

    @Override
    public void cut() {

    }

    @Override
    public void box() {

    }
}
