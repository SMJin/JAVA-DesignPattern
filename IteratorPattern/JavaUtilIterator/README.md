# MenuTestDrive.java Console
```java
package IteratorPattern.JavaUtilIterator;

public class MenuTestDrive {
    public static void main(String[] args) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu);

        waitress.printMenu();
    }
}
```
```bash
메뉴
----
<<아침 메뉴>>
K&B 팬케이크 세트, 2.99 -- 스크램블드 에그와 토스트가 곁들여진 팬케이크
레귤러 팬케이크 세트, 2.99 -- 달걀 후라이와 소시지가 곁들여진 팬케이크
블루베리 팬케이크, 3.49 -- 신선한 블루베리와 블루베리 시럽으로 만든 팬케이크
와플, 3.59 -- 와플, 취향에 따라 블루베리나 딸기를 얹을 수 있습니다.

Process finished with exit code 0
```