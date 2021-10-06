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

# 의도 (Intention)
##### 개체 간의 일대다 종속성을 정의하여 한 개체의 상태가 변경되면 모든 종속 개체가 자동으로 알림 및 업데이트되도록 하기 위함이다. 이벤트가 발생했음을 다양한 개체 목록에 알려야 한다. Observer 는 이벤트 모니터링에 대한 책임을 중심 객체(the Subject)에게 위임한다.

# 단점 (Demerit)
##### 어떤 Observer 들에게는 필요 없는 정보까지 알게 될 수도 있다. 모든 Observer 들에게 동일한 정보를 뿌리기 때문이다. 또한, Observer 가 추가 정보를 요청할 경우 추가 통신이 필요할 수도 있다.

# 정의 (Definition)
##### 한 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체들한테 연락이 가고 자동으로 내용이 갱신되는 방식으로 일대다(one-to-many) 의존성을 정의한다. 대부분의 옵저버패턴은 Subject 인터페이스와 Observer 인터페이스가 들어있는 클래스 디자인을 바탕으로 한다.

# 느슨한 결합 (LooseCoupling)
##### 두 객체가 느슨하게 결합되어 있다는 것은, 그 둘이 상호작용을 하긴 하지만 서로에 대해 서로 잘 모른다는 의미이다. Subject 는 Observer 가 특정 인터페이스를 구현한다는 사실은 알고 있지만, 구체적으로 구상 클래스가 무엇인지, 무엇을 하는지 등에 대해서는 알 필요가 없다. 그에 따라서 다음의 장점들을 가진다.
##### 1. Observer 는 언제든지 새로 추가할 수 있다.
##### 2. Observer 를 추가할 때 Subject 를 전혀 변경할 필요가 없다.
##### 3. Subject 와 Observer 는 서로 독립적으로 재사용할 수 있다.
##### 4. Subject 나 Observer 가 바뀌더라도 서로에게 영향을 미치지 않는다.

# 옵저버패턴 (ObserverPattern)
![inline-block](./ObserverPattern/ObserverPattern.png)

# 기상 스테이션 구현 예제 (WeatherStation)
![inline-block](./WeatherStation/ObserverPattern_WeatherStation.png)
