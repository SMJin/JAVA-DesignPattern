package DecoratorPattern.ExpandDecoratorPattern;

public class Whip extends Condiment{
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Whip";
    }

    @Override
    public String getSize() {
        return beverage.getSize();
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
