package DecoratorPattern.ExpandDecoratorPattern;

public class Caramel extends Condiment{
    public Caramel(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Caramel";
    }


    @Override
    public String getSize() {
        return beverage.getSize();
    }

    @Override
    public double cost() {
        return .25 + beverage.cost();
    }
}
