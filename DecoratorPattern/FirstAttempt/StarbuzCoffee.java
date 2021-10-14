package DecoratorPattern.FirstAttempt;

public class StarbuzCoffee {
    public static void main(String[] args) {
        Beverage berverage = new HouseBlend();
        berverage.setMocha();
        System.out.println(berverage.getDescription());

        berverage = new DarkRoast();
        berverage.setWhip();
        System.out.println(berverage.getDescription());

        berverage = new Decaf();
        berverage.setSoy();
        System.out.println(berverage.getDescription());

        berverage = new Espresso();
        berverage.setMilk();
        System.out.println(berverage.getDescription());
    }
}
