package FactoryPattern.AbstractFactory;

import FactoryPattern.AbstractFactory.Cheese.*;
import FactoryPattern.AbstractFactory.Clam.*;
import FactoryPattern.AbstractFactory.Dough.*;
import FactoryPattern.AbstractFactory.Pepperoni.*;
import FactoryPattern.AbstractFactory.Sauce.*;
import FactoryPattern.AbstractFactory.Veggie.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory
{

    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    public Veggies[] createVeggie() {
        Veggies veggies[] = { new BlackOlives(),
                new Spinach(),
                new Eggplant() };
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FrozenClams();
    }
}
