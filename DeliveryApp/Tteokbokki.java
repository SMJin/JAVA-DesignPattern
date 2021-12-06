package DeliveryApp;

public class Tteokbokki implements Orderable{
    @Override
    public void showStore() {
        System.out.println("\n떡볶이 체인점 매장 목록입니다.\n" +
                "1번. 엽기 떡볶이\n" +
                "2번. 죠스 떡볶이");
    }
}
