package TemplatePattern.CaffeineBeverage;

public abstract class CaffeineBeverage {
    public abstract void prepareRecipe();
    public void boilWater() {
        System.out.println("물 끓이는 중");
    }
    public void pourInCup() {
        System.out.println("컵에 따르는 중");
    }
}
