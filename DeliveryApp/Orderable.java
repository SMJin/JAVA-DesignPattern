package DeliveryApp;

import java.util.Scanner;

public interface Orderable {
    public default int selectStore() {
        showStore();
        if (this == new NoOrder()) {
            return -1;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 번 매장을 선택하시겠습니까 ? : ");
        int selectNumber = scanner.nextInt();
        if (selectNumber < 0 || selectNumber > 2) {
            System.out.println("잘못된 번호입니다.");
            return -1;
        }
        return selectNumber;
    }

    public void showStore();
}
