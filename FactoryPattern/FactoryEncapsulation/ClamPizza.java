package FactoryPattern.FactoryEncapsulation;

public class ClamPizza extends Pizza{
    @Override
    void prepare() {
        System.out.println("preparing ... clam");
    }

    @Override
    void bake() {
        System.out.println("baking ... clam");
    }

    @Override
    void cut() {
        System.out.println("cutting ... clam");
    }

    @Override
    void box() {
        System.out.println("boxing ... clam");
    }
}
