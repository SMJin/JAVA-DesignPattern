package DecoratorPattern.ExpandDecoratorPattern;

public class Mocha extends Condiment{
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Mocha";
    }

    @Override
    public String getSize() {
        return beverage.getSize();
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
