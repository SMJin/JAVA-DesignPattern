package TemplateMethodPattern.CaffeineBeverage;

public class Tea extends CaffeineBeverage{
    @Override
    public void prepareRecipe() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    public void steepTeaBag() {
        System.out.println("차를 우려내는 중");
    }

    public void addLemon() {
        System.out.println("레몬을 추가하는 중");
    }
}
