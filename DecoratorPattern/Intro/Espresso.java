package DecoratorPattern.Intro;

public class Espresso extends Berverage{
    public Espresso() {
        description = "\nEspresso is offee-brewing method of Italian origin, in which a small amount of nearly boiling water is forced under pressure through finely-ground coffee beans.";
    }

    @Override
    public double cost() {
        return 1.03;
    }
}
