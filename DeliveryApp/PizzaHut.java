package DeliveryApp;

import DeliveryApp.ingredients.Cheese;
import DeliveryApp.ingredients.MozzarellaCheese;
import DeliveryApp.ingredients.pizza.DoughEdge.DoughEdge;
import DeliveryApp.ingredients.pizza.DoughEdge.RichGoldEdge;
import DeliveryApp.ingredients.pizza.size.MSize;
import DeliveryApp.ingredients.pizza.size.Size;

public class PizzaHut extends AbstractPizzaFactory {
    @Override
    public DoughEdge selectDoughEdge() {
        return new RichGoldEdge();
    }

    @Override
    public Cheese selectCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Size selectSize() {
        return new MSize();
    }
}
