package DeliveryApp;

public class NoOrder implements Orderable{
    @Override
    public void showStore() {
        System.out.println("매장이 없습니다.");
    }
}
