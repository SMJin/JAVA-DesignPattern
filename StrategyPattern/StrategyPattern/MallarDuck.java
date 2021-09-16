package StrategyPattern.StrategyPattern;

public class MallarDuck extends Duck{

    MallarDuck() {
        super(new Quack(), new FlyWithWings());
    }

    @Override
    public void display() {
        System.out.println("제 푸른 머리 어때요?");
    }
}
