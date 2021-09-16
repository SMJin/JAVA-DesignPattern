package StrategyPattern.StrategyPattern;

public class DuckExam {
    public static void main(String[] args) {
        Duck duck = new MallarDuck();
        duck.display();
        duck.fly();
        duck.quack();
        duck.swim();
        System.out.println();

        duck = new RedHeadDuck();
        duck.display();
        duck.fly();
        duck.quack();
        duck.swim();
        System.out.println();

        duck = new RubberDuck();
        duck.display();
        duck.fly();
        duck.quack();
        duck.swim();
        System.out.println();

        duck = new DecoyDuck();
        duck.display();
        duck.fly();
        duck.quack();
        duck.swim();
        System.out.println();
    }
}
