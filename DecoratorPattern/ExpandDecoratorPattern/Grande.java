package DecoratorPattern.ExpandDecoratorPattern;

public class Grande extends SizeDecorator{
    Beverage beverage;

    public Grande(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }

    @Override
    public String getSize() {
        return "Grande";
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }
}
