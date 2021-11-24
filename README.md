## Welcome to JAVA DesignPattern Class !
##### 이 레파지토리는 대학 강좌 디자인패턴 수업을 들으면서 작성된 코드입니다.
##### 수업 정보 : DKU Design Pattern (professor. Yongbeom Bark)
##### 교제 정보 : Head First Design Pattern

# [Strategy Pattern](./StrategyPattern)
##### 스트레티지 패턴에서는 알고리즘 군을 정의하고 각각을 캡슐화하여 교환해서 사용할 수 있도록 만든다. 이를 활용하면 알고리즘을 사용하는 클라이언트와는 독립적으로 알고리즘을 변경할 수 있다.

# [Observer Pattern](./ObserverPattern)
##### 한 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체들한테 연락이 가고 자동으로 내용이 갱신되는 방식으로 일대다(one-to-many) 의존성을 정의한다. 대부분의 옵저버패턴은 Subject 인터페이스와 Observer 인터페이스가 들어있는 클래스 디자인을 바탕으로 한다.

# [Decorator Pattern](./DecoratorPattern)
##### 의도 : 데코레이터 패턴에서는 객체의 추가적인 요건을 동적으로 첨가합니다. 데코레이터는 서브클래스를 만드는 것을 통해서 기능을 유연하게 확장할 수 있는 방법을 제공합니다.
##### 동기 : 사용할 개체는 필요한 기본 기능을 수행합니다. 그러나 개체의 기본 기능 전후에 발생하는 일부 기능을 개체에 추가해야 할 수도 있습니다.
##### 해결 : 하위 분류에 의존하지 않고 개체의 기능을 확장할 수 있습니다.

# [Factory Pattern](./FactoryPattern)
##### 팩토리 메소드 패턴에서는 객체를 생성하기 위한 인터페이스를 정의하는데, 어떤 클래스의 인스턴스를 만들지는 서브클래스에서 결정하게 만든다. 팩토리 메소드 패턴을 이용하면 클래스의 인스턴스를 만드는 일을 서브클래스에게 맡기는 것이다.

# [Singleton Pattern](./SingletonPattern)
##### 싱글턴 패턴은 해당 클래스의 인스턴스가 하나만 만들어지고, 어디서든지 그 인스턴스에 접근할 수 있도록 하기 위한 패턴이다.

# [Command Pattern](./CommandPattern)
##### 커맨드 패턴을 이용하면 요구 사항을 객체로 캡슐화 할 수 있으며, 매개변수를 써서 여러 가지 다른 요구 사항을 집어넣을 수도 있다. 또한 요청 내역을 큐에 저장하거나 로그로 기록할 수도 있으며, 작업취소 기능도 지원 가능하다.
##### 커맨드 객체는 일련의 행동을 특정 리시버하고 연결시킴으로써 요구 사항을 캡슐화한 것이다. 이를 위해 행동과 리시버를 한 객체에 집어넣고, execute() 라는 메소드 하나만 외부에 공개하는 방법을 사용한다. 외부에서 볼 때는 어떤 객체가 리시버 역할을 하는지, 그 리시버에서 실제로 어떤 일을 하는지 알 수 없다. 그냥 execute() 메소드를 호출하면 요구 사항이 처리된다는 것만 알 수 있을 뿐이다.

# [Adaptor Pattern](./AdaptorPattern)
##### 한 클래스의 인터페이스를 클라이언트에서 사용하고자 하는 다른 인터페이스로 변환한다. 어댑터를 이용하면 인터페이스 호완성 문제 때문에 같이 쓸 수 없는 클래스들을 연결해서 슬 수 있다.

# [Template Method Pattern](./TemplateMethodPattern)
##### 메소드에서 알고리즘의 골격을 정의한다. 알고리즘의 여러 단계 중 일부는 서브클래스에서 구현할 수 있다. 템플릿 메소드를 이용하면 알고리즘의 구조는 그대로 유지하면서 서브클래스에서 특정 단계를 재정의할 수 있다.