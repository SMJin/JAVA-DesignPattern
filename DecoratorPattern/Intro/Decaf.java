package DecoratorPattern.Intro;

public class Decaf extends Beverage {
    public Decaf() {
        description = "\nDecaf is the best decaffeinated coffee !";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
