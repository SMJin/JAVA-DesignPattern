package FactoryPattern.FactoryEncapsulation;

public class Main {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());

        Pizza pizza = pizzaStore.orderPizza("cheese");
        pizza = pizzaStore.orderPizza("pepperoni");
        pizza = pizzaStore.orderPizza("clam");
        pizza = pizzaStore.orderPizza("veggie");
    }
}
