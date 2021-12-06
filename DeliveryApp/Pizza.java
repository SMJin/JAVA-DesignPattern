package DeliveryApp;

public class Pizza implements Orderable{
    @Override
    public void showStore() {
        System.out.println("\n피자 체인점 매장 목록입니다.\n" +
                "1번. 피자 헛\n" +
                "2번. 피자나라 치킨공주");
    }
}
