package com.pdt.abstractfactory;

import com.pdt.abstractfactory.stores.ChicagoStylePizzaStore;
import com.pdt.abstractfactory.stores.NYStylePizzaStore;
import com.pdt.abstractfactory.stores.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
