package StrategyPattern.AbstractClass;

public abstract class Duck {
    void quack() {
        System.out.println("꽥꽥!");
    }
    void swim() {
        System.out.println("오리가 유유히 헤엄칩니다.");
    }
    void display() {
        System.out.println("오리가 자신의 자태를 뽐내고 있습니다.");
    }
    void fly() {
        System.out.println("오리, 날다 ! 훨훨~");
    }
}
