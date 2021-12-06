package DeliveryApp;

import DeliveryApp.ingredients.*;
import DeliveryApp.ingredients.pizza.DoughEdge.DoughEdge;
import DeliveryApp.ingredients.pizza.size.Size;

public abstract class AbstractPizzaFactory {
    public abstract DoughEdge selectDoughEdge();
    public abstract Cheese selectCheese();
    public abstract Size selectSize();
}
