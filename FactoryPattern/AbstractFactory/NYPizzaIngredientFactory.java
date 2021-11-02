package FactoryPattern.AbstractFactory;

import FactoryPattern.AbstractFactory.Cheese.* ;
import FactoryPattern.AbstractFactory.Clam.*;
import FactoryPattern.AbstractFactory.Dough.*;
import FactoryPattern.AbstractFactory.Pepperoni.*;
import FactoryPattern.AbstractFactory.Sauce.*;
import FactoryPattern.AbstractFactory.Veggie.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Veggies[] createVeggie() {
        Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }
}
