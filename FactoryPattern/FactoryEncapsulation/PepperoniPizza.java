package FactoryPattern.FactoryEncapsulation;

public class PepperoniPizza extends Pizza{
    @Override
    void prepare() {
        System.out.println("preparing ... pepperoni");
    }

    @Override
    void bake() {
        System.out.println("baking ... pepperoni");
    }

    @Override
    void cut() {
        System.out.println("cutting ... pepperoni");
    }

    @Override
    void box() {
        System.out.println("boxing ... pepperoni");
    }
}
