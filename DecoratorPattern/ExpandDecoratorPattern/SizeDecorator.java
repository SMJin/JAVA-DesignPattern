package DecoratorPattern.ExpandDecoratorPattern;

public abstract class SizeDecorator extends Beverage{
    protected Beverage beverage;
    public abstract String getSize();
    public abstract String getDescription();
}
