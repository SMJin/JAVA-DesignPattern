# MenuTestDrive.java Console
```java
package IteratorPattern.IteratorWaitress;

public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);

        waitress.printMenu();
    }
}
```
```bash
메뉴
----
아침 메뉴
K&B 팬케이크 세트, 2.99 -- 스크램블드 에그와 토스트가 곁들여진 팬케이크
레귤러 팬케이크 세트, 2.99 -- 달걀 후라이와 소시지가 곁들여진 팬케이크
블루베리 팬케이크, 3.49 -- 신선한 블루베리와 블루베리 시럽으로 만든 팬케이크
와플, 3.59 -- 와플, 취향에 따라 블루베리나 딸기를 얹을 수 있습니다.
점심 메뉴
채식주의자용 BLT, 2.99 -- 통밀 위에 (식물성)베이컨, 상추, 토마토를 얹은 메뉴
BLT, 2.99 -- 통밀 위에 베이컨, 상추, 토마토를 얹은 메뉴
오늘의 스프, 3.29 -- 감자 샐러드를 곁들인 오늘의 스프
핫도그, 3.05 -- 사워크라우트, 갖은 양념, 양파, 치즈가 곁들여진 핫도그

Process finished with exit code 0

```