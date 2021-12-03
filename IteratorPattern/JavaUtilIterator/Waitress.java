package IteratorPattern.JavaUtilIterator;

import java.util.Iterator;

public class Waitress {
    Menu pancakeHouseMenu;

    public Waitress(Menu pancakeHouseMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
    }

    public void printMenu() {
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        System.out.println("메뉴\n----\n<<아침 메뉴>>");
        printMenu(pancakeIterator);
    }

    public void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName() + ", " +
                    menuItem.getPrice() + " -- " +
                    menuItem.getDescription());
        }
    }
}
