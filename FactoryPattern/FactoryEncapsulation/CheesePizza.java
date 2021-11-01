package FactoryPattern.FactoryEncapsulation;

public class CheesePizza extends Pizza{
    @Override
    void prepare() {
        System.out.println("preparing ... cheese");
    }

    @Override
    void bake() {
        System.out.println("baking ... cheese");
    }

    @Override
    void cut() {
        System.out.println("cutting ... cheese");
    }

    @Override
    void box() {
        System.out.println("boxing ... cheese");
    }
}
