package StrategyPattern.Intro;

public class Dog implements Pet{
    @Override
    public void cry() {
        bark();
    }
    private void bark() {
        System.out.println("멍멍!");
    }
}
