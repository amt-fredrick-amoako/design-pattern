package com.pdt.abstractfactory.stores;

import com.pdt.abstractfactory.Pizza;
import com.pdt.abstractfactory.pizzatypes.california.CaliforniaStyleCheesPizza;
import com.pdt.abstractfactory.pizzatypes.california.CaliforniaStyleClamPizza;
import com.pdt.abstractfactory.pizzatypes.california.CaliforniaStylePepperoniPizza;
import com.pdt.abstractfactory.pizzatypes.california.CaliforniaStyleVeggiePizza;
import com.pdt.abstractfactory.pizzatypes.chicago.ChicagoStyleCheesPizza;
import com.pdt.abstractfactory.pizzatypes.chicago.ChicagoStyleClamPizza;
import com.pdt.abstractfactory.pizzatypes.chicago.ChicagoStylePepperoniPizza;
import com.pdt.abstractfactory.pizzatypes.chicago.ChicagoStyleVeggiePizza;

public class CaliforniaStylePizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new CaliforniaStyleCheesPizza();
        } else if (type.equals("pepperoni")) {
            return new CaliforniaStylePepperoniPizza();
        } else if (type.equals("clam")) {
            return new CaliforniaStyleClamPizza();
        } else if (type.equals("veggie")) {
            return new CaliforniaStyleVeggiePizza();
        }
        return null;
    }
}
