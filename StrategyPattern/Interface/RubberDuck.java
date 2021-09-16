package StrategyPattern.Interface;

public class RubberDuck extends Duck implements Flyable, Quackable {

    @Override
    public void quack() {
        squeak();
    }

    private void squeak() {
        System.out.println("삑삑!");
    }

    @Override
    void display() {
        System.out.println("노란 고무에 귀여운 주황색 부리.");
    }

    @Override
    public void fly() {
        handThrowing();
    }

    private void handThrowing() {
        System.out.println("오리가 던져집니다. 휙~");
    }
}
