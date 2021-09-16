package StrategyPattern.Interface;

public class MallardDuck extends Duck implements Flyable, Quackable {
    @Override
    void display() {
        System.out.println("청둥오리가 자신의 아름다운 푸른머리를 뽑냅니다.");
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
