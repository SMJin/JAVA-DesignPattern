package IteratorPattern.Problem;

import java.util.ArrayList;

public class Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    ArrayList breakfastItems;

    DinerMenu dinerMenu;
    MenuItem[] lunchItems;

    public Waitress() {
        pancakeHouseMenu = new PancakeHouseMenu();
        breakfastItems = pancakeHouseMenu.getMenuItems();

        dinerMenu = new DinerMenu();
        lunchItems = dinerMenu.getMenuItems();
    }

    public void printMenu() {
        printBreakfastMenu();
        printLunchMenu();
    }

    public void printBreakfastMenu() {
        for(int i=0; i<breakfastItems.size(); i++) {
            MenuItem menuItem = (MenuItem) breakfastItems.get(i);
            System.out.println(menuItem.getName() + " $"
                    + menuItem.getPrice());
            System.out.println(menuItem.getDescription());
        }
    }

    public void printLunchMenu() {
        for(int i=0; i<lunchItems.length; i++) {
            MenuItem menuItem = lunchItems[i];
            System.out.println(menuItem.getName() + " $"
                    + menuItem.getPrice());
            System.out.println(menuItem.getDescription());
        }
    }
}
