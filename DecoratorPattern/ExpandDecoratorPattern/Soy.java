package DecoratorPattern.ExpandDecoratorPattern;

public class Soy extends Condiment{
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Soy";
    }

    @Override
    public String getSize() {
        return beverage.getSize();
    }

    @Override
    public double cost() {
        return .15 + beverage.cost();
    }
}
