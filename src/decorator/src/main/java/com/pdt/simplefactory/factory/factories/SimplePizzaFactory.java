package com.pdt.simplefactory.factory.factories;

import com.pdt.simplefactory.factory.pizzastore.PizzaStore;
import com.pdt.simplefactory.factory.pizzatypes.CheesePizza;
import com.pdt.simplefactory.factory.pizzatypes.ClamPizza;
import com.pdt.simplefactory.factory.pizzatypes.PepperoniPizza;
import com.pdt.simplefactory.factory.pizzatypes.VeggiePizza;

public class SimplePizzaFactory{
    public PizzaStore.Pizza createPizza(String type){
        PizzaStore.Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        }else if(type.equals("veggie")){
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
