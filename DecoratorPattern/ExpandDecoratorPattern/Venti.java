package DecoratorPattern.ExpandDecoratorPattern;

public class Venti extends SizeDecorator{
    Beverage beverage;

    public Venti(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }

    @Override
    public String getSize() {
        return "Venti";
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }
}