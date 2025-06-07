package com.pdt.abstractfactory.ingredients.factory.contract;

import com.pdt.abstractfactory.ingredients.rawmaterials.basematerials.*;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies ();
    Pepperoni createPepperoni();
    Clams createClam();
}
