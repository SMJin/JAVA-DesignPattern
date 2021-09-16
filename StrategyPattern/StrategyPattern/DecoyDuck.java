package StrategyPattern.StrategyPattern;

public class DecoyDuck extends Duck{
    DecoyDuck() {
        super(new MuteQuack(), new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("고풍스러우며 단단한 오리모형.");
    }
}
