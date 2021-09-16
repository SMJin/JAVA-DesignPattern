package StrategyPattern.StrategyPattern;

public class RedHeadDuck extends Duck{
    RedHeadDuck() {
        super(new Quack(), new FlyWithWings());
    }

    @Override
    public void display() {
        System.out.println("제 붉은 머리 어때요?");
    }
}
