package DecoratorPattern.ExpandDecoratorPattern;

public abstract class Condiment extends Beverage {
    protected Beverage beverage;
    public abstract String getSize();
    public abstract String getDescription();
}
