package StrategyPattern.AbstractClass;

public class DecoyDuck extends Duck{
    @Override
    void quack() {
        silence();
    }
    private void silence() {
        System.out.println("...(정적)");
    }

    @Override
    void display() {
        System.out.println("딱딱하지만 고풍있는 나무모형.");
    }

    @Override
    void swim() {
        canNotMove();
    }
    private void canNotMove() {
        System.out.println("...(미동도 없다.)");
    }

    @Override
    void fly() {
        handThrowing();
    }
    private void handThrowing() {
        System.out.println("휙! 슈우웅~ 탁, 데구르르...(부실뻔 했다)");
    }
}
