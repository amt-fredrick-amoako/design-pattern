package com.pdt.abstractfactory.ingredients.factory;

import com.pdt.abstractfactory.ingredients.factory.contract.PizzaIngredientFactory;
import com.pdt.abstractfactory.ingredients.rawmaterials.*;
import com.pdt.abstractfactory.ingredients.rawmaterials.basematerials.*;
import com.pdt.abstractfactory.ingredients.rawmaterials.ny.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarianaSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
