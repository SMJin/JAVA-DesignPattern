package DecoratorPattern.FirstAttempt;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "HouseBlend is combining two different beans to produce different flavors and strengths...\n";
    }

    @Override
    public double cost() {
        return 1.54 + super.cost();
    }
}
