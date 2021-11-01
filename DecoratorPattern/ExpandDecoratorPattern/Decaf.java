package DecoratorPattern.ExpandDecoratorPattern;

public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf Coffee";
        size = "Tall";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
