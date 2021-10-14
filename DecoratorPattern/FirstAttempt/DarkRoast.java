package DecoratorPattern.FirstAttempt;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "DarkRoast is Our “roast levels” are used to describe how long and thoroughly we roast the coffee beans.\n" +
                "The most common words to describe different levels of coffee roasting are Light, Medium, and Dark.\n" +
                "And this is the best Dark Roast Coffee.\n";
    }

    @Override
    public double cost() {
        return 1.29 + super.cost();
    }
}
