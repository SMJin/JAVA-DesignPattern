package FactoryPattern.FactoryEncapsulation;

public class VeggiePizza extends Pizza{
    @Override
    void prepare() {
        System.out.println("preparing ... veggie");
    }

    @Override
    void bake() {
        System.out.println("baking ... veggie");
    }

    @Override
    void cut() {
        System.out.println("cutting ... veggie");
    }

    @Override
    void box() {
        System.out.println("boxing ... veggie");
    }
}
