package FactoryPattern.AbstractFactory;

import FactoryPattern.AbstractFactory.Dough.Dough;
import FactoryPattern.AbstractFactory.Cheese.Cheese;
import FactoryPattern.AbstractFactory.Clam.Clams;
import FactoryPattern.AbstractFactory.Pepperoni.Pepperoni;
import FactoryPattern.AbstractFactory.Sauce.Sauce;
import FactoryPattern.AbstractFactory.Veggie.Veggies;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Cheese createCheese();
    public Clams createClam();
    public Pepperoni createPepperoni();
    public Sauce createSauce();
    public Veggies[] createVeggie();
}
