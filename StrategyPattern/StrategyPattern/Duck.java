package StrategyPattern.StrategyPattern;

public abstract class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    Duck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        this.quackBehavior = quackBehavior;
        this.flyBehavior = flyBehavior;
    }

    public void quack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("오리는 유유히 수영중이다...");
    }

    public void display() {
        System.out.println("오리가 자신의 자태를 뽐내고 있다.");
    }

    public void fly() {
        flyBehavior.fly();
    }
}
