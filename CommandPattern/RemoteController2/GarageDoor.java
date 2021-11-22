package CommandPattern.RemoteController2;

public class GarageDoor {
    String location = "";
    public GarageDoor(String location) {
        this.location = location;
    }
    public void open() {
        System.out.println(location + " GarageDoor open!");
    }
    public void close() {
        System.out.println(location + " GarageDoor close!");
    }
}
