package StrategyPattern.StrategyPattern;

public class RubberDuck extends Duck{
    RubberDuck() {
        super(new Squeak(), new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("노란 고무 바탕에 주황색 귀여운 부리.");
    }
}
