package DecoratorPattern.FirstAttempt;

public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf is the best decaffeinated coffee !\n";
    }

    @Override
    public double cost() {
        return 1.34 + super.cost();
    }
}
