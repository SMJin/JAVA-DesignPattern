package DecoratorPattern.Intro;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "\nDarkRoast is Our “roast levels” are used to describe how long and thoroughly we roast the coffee beans.\n" +
                "The most common words to describe different levels of coffee roasting are Light, Medium, and Dark.\n" +
                "And this is the best Dark Roast Coffee.";
    }

    @Override
    public double cost() {
        return .99;
    }
}
