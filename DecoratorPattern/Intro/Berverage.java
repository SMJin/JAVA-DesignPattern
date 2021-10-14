package DecoratorPattern.Intro;

public abstract class Berverage {
    public String description = "";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
