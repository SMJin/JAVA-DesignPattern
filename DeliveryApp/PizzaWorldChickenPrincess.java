package DeliveryApp;

import DeliveryApp.ingredients.Cheese;
import DeliveryApp.ingredients.MozzarellaCheese;
import DeliveryApp.ingredients.pizza.DoughEdge.CheeseCrust;
import DeliveryApp.ingredients.pizza.DoughEdge.DoughEdge;
import DeliveryApp.ingredients.pizza.size.LSize;
import DeliveryApp.ingredients.pizza.size.Size;

public class PizzaWorldChickenPrincess extends AbstractPizzaFactory{
    @Override
    public DoughEdge selectDoughEdge() {
        return new CheeseCrust();
    }

    @Override
    public Cheese selectCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Size selectSize() {
        return new LSize();
    }
}
