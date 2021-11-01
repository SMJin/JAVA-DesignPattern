package DecoratorPattern.ExpandDecoratorPattern;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast Coffee";
        size = "Tall";
    }

    @Override
    public double cost() {
        return .99;
    }
}
