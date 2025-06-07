package com.pdt.abstractfactory.stores;

import com.pdt.abstractfactory.Pizza;
import com.pdt.abstractfactory.ingredients.factory.NYPizzaIngredientFactory;
import com.pdt.abstractfactory.ingredients.factory.contract.PizzaIngredientFactory;
import com.pdt.abstractfactory.pizzatypes.CheesePizza;
import com.pdt.abstractfactory.pizzatypes.ClamPizza;
import com.pdt.abstractfactory.pizzatypes.ny.NYStyleCheesPizza;
import com.pdt.abstractfactory.pizzatypes.ny.NYStyleClamPizza;
import com.pdt.abstractfactory.pizzatypes.ny.NYStylePepperoniPizza;
import com.pdt.abstractfactory.pizzatypes.ny.NYStyleVeggiePizza;
import com.pdt.simplefactory.pizzatypes.PepperoniPizza;
import com.pdt.simplefactory.pizzatypes.VeggiePizza;

public class NYStylePizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("cheese");
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("veggie");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("clam");
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("veggie");
        }
        return pizza;
    }
}

