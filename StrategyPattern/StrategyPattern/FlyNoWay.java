package StrategyPattern.StrategyPattern;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        canNotMove();
    }
    private void canNotMove() {
        System.out.println("...(미동도 없다.)");
    }
}
