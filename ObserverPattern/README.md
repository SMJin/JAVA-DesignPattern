## Observer Pattern 이해하기

# 도입 (Intro)
##### GitHub 에는 pull 과 push 의 개념이 있다. 원격 저장소는 개발자들끼리 데이터의 공유와 갱신을 효율적으로 하기 위함의 목적이 핵심이다. 옵저버패턴은 이와 비슷하다.
![inline-block](./Intro/observer-intro.png)
##### WeatherData 객체는 기상 스테이션으로부터 데이터를 가져올 수 있다. 데이터를 가져온 후에는 디스플레이 장비에 세 가지 항목을 표시할 수 있다. 첫 번째는 현재 조건(온도, 습도, 압력)이고, 두 번째는 기상 통계, 세 번째는 간단한 기상 예보이다.
![inline-block](./Intro/UML-WeatherData-intro.png)
##### 데이터가 갱신될 때마다 디스플레이 화면도 갱신해야 했기 때문에, measurementsChanged() 메소드를 위와 같이 생성하게 되었다. 그러나 정말 이게 최선일까?

# 문제점 (Problem)
##### 1. 인터페이스가 아닌 구체적인 구현을 바탕으로 코딩하고 있다. display.update() 메소드들을 살펴보면 공통적인 부분이 눈에 띈다.
##### 2. SOLID 중 OCP;Open/Close Principle(개방/폐쇄 원칙) 을 위반한다. ("소프트웨어 객체는 확장에 대해서 열려있어야 하지만, 수정에 대해서는 닫혀있어야 한다."는 원칙) 실행중에 디스플레이 항목을 추가/제거할 수 없다.
##### 3. SOLID 중 DIP;Dependency Inversion Principle(의존 역전 법칙) 을 위반한다. ("자신보다 변하기 쉬운 것에는 의존하지 않아야 한다."는 원칙) 바뀌는 부분을 캡슐화하지 않았다. 그러니까, 상위 모듈은 하위 모듈의 구현에 의존해서는 안된다. 하위 모듈이 상위 모듈에 정의한 추상 타입에 의존해야 한다.
![inline-block](./Problem/observer-problem.jpg)