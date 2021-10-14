package DecoratorPattern.FirstSolution;

public class Espresso extends Berverage{
    public Espresso() {
        description = "Espresso is coffee-brewing method of Italian origin, in which a small amount of nearly boiling water is forced under pressure through finely-ground coffee beans.\n";
    }

    @Override
    public double cost() {
        return 1.03 + super.cost();
    }
}
