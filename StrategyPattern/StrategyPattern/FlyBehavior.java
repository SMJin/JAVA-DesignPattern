package StrategyPattern.StrategyPattern;

public interface FlyBehavior {
    default void fly() {
        System.out.println("오리 날다! 훨훨~");
    };
}
