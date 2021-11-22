package CommandPattern.RemoteController2;

public class CeilingFan {
    String location = "";
    public CeilingFan(String location) {
        this.location = location;
    }
    public void on() {
        System.out.println(location + " ceilingFan is on high!");
    }
    public void off() {
        System.out.println(location + " ceilingFan is off!");
    }
}
