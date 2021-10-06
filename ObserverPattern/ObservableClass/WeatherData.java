package ObserverPattern.ObservableClass;

import java.util.Observable;

/*
* Observer 들을 직접 챙기고 등록/탈퇴 등을 직접 관리하지 않아도 되기 때문에
* 등록, 추가, 연락 등을 위한 코드는 전부 제외해도 된다.
* (Super Class 인 Observable Class 에서 모두 해주기 때문이다.)
* */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    //   이제는 생성자에서 Observer 들을 저장하기 위한 자료구조를 만들 필요가 없다.
    //  WeatherData() {
    //      // ...
    //  }

    public void measurementsChanged() {
        setChanged();
        // notifyObservers() 메소드에서 데이터 객체를 내보내지 않는다.
        // 여기에서는 풀 모델을 사용하고 있기 때문이다.
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
