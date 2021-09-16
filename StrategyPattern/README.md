# Strategy Pattern 이해하기

### 도입 (Intro)
##### 우리는 자바의 다형성을 사랑한다. 지금껏 Pet interface 를 상속받는 Dog class 와 Cat class 를 만들면서 인터페이스 구현을 이용해 다형성을 지켰다며 뿌듯해했다. 그러나, 정말 이게 최선일까?
![inline-block](./Intro/UMLet-Strategy-Intro.png)

### 추상 클래스 상속 다형성 구현 (AbstractClass)
##### 평소처럼 상속을 이용해 다형성을 구현하기 위해서 Duck 추상 클래스를 만들었다. 그리고 그 클래스를 MallardDuck Class, RedHeadDuck Class 가 상속을 하도록 만들었다.
![inline-block](./AbstractClass/duck-1.png)