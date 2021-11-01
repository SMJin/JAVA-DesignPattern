package DecoratorPattern.ExpandDecoratorPattern;

public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
        size = "Tall";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
