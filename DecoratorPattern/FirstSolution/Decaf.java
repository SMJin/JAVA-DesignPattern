package DecoratorPattern.FirstSolution;

public class Decaf extends Berverage{
    public Decaf() {
        description = "Decaf is the best decaffeinated coffee !\n";
    }

    @Override
    public double cost() {
        return 1.34 + super.cost();
    }
}
