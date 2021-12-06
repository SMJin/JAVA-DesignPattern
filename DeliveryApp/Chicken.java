package DeliveryApp;

public class Chicken implements Orderable{
    @Override
    public void showStore() {
        System.out.println("\n치킨 체인점 매장 목록입니다.\n" +
                "1번. 교촌 치킨\n" +
                "2번. 치킨 플러스");
    }
}
