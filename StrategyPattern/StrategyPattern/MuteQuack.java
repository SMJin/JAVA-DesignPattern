package StrategyPattern.StrategyPattern;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        silence();
    }
    private void silence() {
        System.out.println("...(정적)");
    }
}
