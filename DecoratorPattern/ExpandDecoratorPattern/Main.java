package DecoratorPattern.ExpandDecoratorPattern;

public class Main {

    public static void main(String[] args) {
        Beverage myBeverage = new HouseBlend();
        myBeverage = new Milk(myBeverage);
        myBeverage = new Venti(myBeverage);
        System.out.println("(" + myBeverage.getSize() + ")" + myBeverage.getDescription() + " $" + myBeverage.cost());
        Beverage yourBeverage = new DarkRoast();
        yourBeverage = new Grande(yourBeverage);
        yourBeverage = new Mocha(yourBeverage);
        yourBeverage = new Whip(yourBeverage);
        System.out.println("(" + yourBeverage.getSize() + ")" + yourBeverage.getDescription() + " $" + yourBeverage.cost());
        Beverage hisBeverage = new Tea();
        hisBeverage = new Soy(hisBeverage);
        System.out.println("(" + hisBeverage.getSize() + ")" + hisBeverage.getDescription() + " $" + hisBeverage.cost());
        Beverage herBeverage = new Espresso();
        herBeverage = new Caramel(herBeverage);
        herBeverage = new Whip(herBeverage);
        System.out.println("(" + herBeverage.getSize() + ")" + herBeverage.getDescription() + " $" + herBeverage.cost());
    }
}
