package DeliveryApp;

import java.util.Scanner;

public class DeliveryApp {
    Scanner scanner;

    DeliveryApp() {
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        DeliveryApp deliveryApp = new DeliveryApp();
        deliveryApp.startApp();
    }

    public void startApp() {
        System.out.println("\n배달 앱이 실행되었습니다 ...");
        Orderable foodType = selectFoodType();
        int storeNumber = foodType.selectStore();
        selectStore(foodType, storeNumber);
    }

    private Orderable selectFoodType() {
        System.out.println("\n현재 배달 가능한 음식점 목록입니다.");
        System.out.println("1.치킨 2.피자 3.떡볶이");
        System.out.print("먹고 싶은 체인점의 종류를 선택해주십시오 : ");

        int selectNumber = scanner.nextInt();
        switch (selectNumber) {
            case 1:
                return new Chicken();
            case 2:
                return new Pizza();
            case 3:
                return new Tteokbokki();
            default:
                System.out.println("유효하지 않은 음식 매장 종류입니다.");
                return new NoOrder();
        }
    }

    private void selectStore(Orderable foodType, int storeNumber) {
        if (foodType.getClass() == new Pizza().getClass()) {
            AbstractPizzaFactory pizzaStore = selectPizzaStore(storeNumber);
            System.out.println(
                    pizzaStore.getClass().toString() + "\n" +
                    pizzaStore.selectDoughEdge() + "\n" +
                    pizzaStore.selectCheese() + "\n" +
                    pizzaStore.selectSize() + "\n"
            );
            if (storeNumber == 2) {
                AbstractChickenFactory PWCP_ChickenMenu
                        = new PizzaWorldChickenPrincessAdaptor(new PizzaWorldChickenPrincess());
                System.out.println(PWCP_ChickenMenu.getClass().toString() + "\n" +
                        PWCP_ChickenMenu.selectSauce() + "\n" +
                        PWCP_ChickenMenu.selectBone() + "\n"
                );
            }
        } else if (foodType.getClass() == new Chicken().getClass()) {
            AbstractChickenFactory chickenStore = selectChickenStore(storeNumber);;
            System.out.println(chickenStore.getClass().toString() + "\n" +
                            chickenStore.selectSauce() + "\n" +
                            chickenStore.selectBone() + "\n"
            );
        } else if (foodType.getClass() == new Tteokbokki().getClass()) {
            AbstractTteokbokkiFactory tteokbokkiStore = selectTteokbokkiStore(storeNumber);
            System.out.println(tteokbokkiStore.getClass().toString() + "\n" +
                            tteokbokkiStore.selectHotGrade() + "\n" +
                            tteokbokkiStore.selectCheese() + "\n" +
                            tteokbokkiStore.selectRiceCake() + "\n"
            );
        } else {
            System.out.println("잘못된 입력입니다.");
        }
    }

    private AbstractPizzaFactory selectPizzaStore (int storeNumber) {
        if (storeNumber == 1) return new PizzaHut();
        else return new PizzaWorldChickenPrincess();
    }

    private AbstractChickenFactory selectChickenStore (int storeNumber) {
        if (storeNumber == 1) return new Kyochon();
        else return new ChickenPlus();
    }

    private AbstractTteokbokkiFactory selectTteokbokkiStore (int storeNumber) {
        if (storeNumber == 1) return new Yupdduk();
        else return new Jaws();
    }

}
