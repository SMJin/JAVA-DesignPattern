package DecoratorPattern.Intro;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "\nHouseBlend is combining two different beans to produce different flavors and strengths...";
    }

    @Override
    public double cost() {
        return .89;
    }
}
