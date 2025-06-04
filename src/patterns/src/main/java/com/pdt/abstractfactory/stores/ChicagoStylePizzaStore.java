package com.pdt.abstractfactory.stores;

import com.pdt.abstractfactory.Pizza;
import com.pdt.abstractfactory.pizzatypes.chicago.ChicagoStyleCheesPizza;
import com.pdt.abstractfactory.pizzatypes.chicago.ChicagoStyleClamPizza;
import com.pdt.abstractfactory.pizzatypes.chicago.ChicagoStylePepperoniPizza;
import com.pdt.abstractfactory.pizzatypes.chicago.ChicagoStyleVeggiePizza;

public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesPizza();
        } else if (type.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else if (type.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if (type.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        }
        return null;
    }
}
