package com.pdt.abstractfactory.stores;

import com.pdt.abstractfactory.Pizza;
import com.pdt.abstractfactory.pizzatypes.ny.NYStyleCheesPizza;
import com.pdt.abstractfactory.pizzatypes.ny.NYStyleClamPizza;
import com.pdt.abstractfactory.pizzatypes.ny.NYStylePepperoniPizza;
import com.pdt.abstractfactory.pizzatypes.ny.NYStyleVeggiePizza;

public class NYStylePizzaStore extends PizzaStore {
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesPizza();
        } else if (type.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else if (type.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        }
        return null;
    }
}

