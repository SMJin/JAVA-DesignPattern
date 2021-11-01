package DecoratorPattern.ExpandDecoratorPattern;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
        size = "Tall";
    }

    @Override
    public double cost() {
        return .89;
    }
}
