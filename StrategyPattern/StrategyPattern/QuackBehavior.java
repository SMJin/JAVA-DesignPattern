package StrategyPattern.StrategyPattern;

public interface QuackBehavior {
    default void quack() {
        System.out.println("꽥꽥!");
    }
}
