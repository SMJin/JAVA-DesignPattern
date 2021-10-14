package DecoratorPattern.Intro;

public class StarbuzCoffee {
    public static void main(String[] args) {
        Beverage berverage = new HouseBlend();
        System.out.println(berverage.getDescription());

        berverage = new DarkRoast();
        System.out.println(berverage.getDescription());

        berverage = new Decaf();
        System.out.println(berverage.getDescription());

        berverage = new Espresso();
        System.out.println(berverage.getDescription());
    }
}
