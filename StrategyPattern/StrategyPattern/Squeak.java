package StrategyPattern.StrategyPattern;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        squeak();
    }
    private void squeak() {
        System.out.println("삑삑!");
    }
}
