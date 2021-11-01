package FactoryPattern.PizzaFranchise;

public class NYStyleVeggie extends Pizza{
    public NYStyleVeggie() {
        name = "NY Style Sauce and Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
