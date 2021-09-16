package StrategyPattern.Intro;

public class Cat implements Pet{
    @Override
    public void cry() {
        meow();
    }
    private void meow() {
        System.out.println("야옹~");
    }
}
