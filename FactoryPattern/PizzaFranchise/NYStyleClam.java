package FactoryPattern.PizzaFranchise;

public class NYStyleClam extends Pizza{
    public NYStyleClam() {
        name = "NY Style Sauce and Clam Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
