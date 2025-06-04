package com.pdt.simplefactory.factory.pizzastore;

import com.pdt.simplefactory.factory.factories.SimplePizzaFactory;

public class PizzaStore {
    SimplePizzaFactory factory;
    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public interface Pizza{
        public void prepare();
        public void bake();
        public void cut();
        public void box();
    }
}

