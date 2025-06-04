package com.pdt.simplefactory.factories;

import com.pdt.simplefactory.pizzastore.PizzaStore;
import com.pdt.simplefactory.pizzatypes.CheesePizza;
import com.pdt.simplefactory.pizzatypes.ClamPizza;
import com.pdt.simplefactory.pizzatypes.PepperoniPizza;
import com.pdt.simplefactory.pizzatypes.VeggiePizza;

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
