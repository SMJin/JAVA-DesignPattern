package StrategyPattern.Interface;

public class RedHeadDuck extends Duck implements Flyable, Quackable {
    @Override
    void display() {
        System.out.println("제 빨간 머리 어때요?");
    }

    @Override
    public void fly() {
        flyWithWings();
    }
    private void flyWithWings() {
        System.out.println("오리, 날다 ! 훨훨~");
    }

    @Override
    public void quack() {
        System.out.println("꽥꽥!");
    }
}
