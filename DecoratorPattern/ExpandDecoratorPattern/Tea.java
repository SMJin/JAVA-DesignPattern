package DecoratorPattern.ExpandDecoratorPattern;

public class Tea extends Beverage{
    public Tea() {
        description = "Tea";
        size = "Tall";
    }

    @Override
    public double cost() {
        return 1.20;
    }
}
