package IteratorPattern.JavaUtilIterator;

public class MenuTestDrive {
    public static void main(String[] args) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu);

        waitress.printMenu();
    }
}
