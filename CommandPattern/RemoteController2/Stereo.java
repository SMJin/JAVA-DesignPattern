package CommandPattern.RemoteController2;

public class Stereo {
    int volume = 0;
    String location = "";

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " stereo is on!");
    }
    public void off() {
        System.out.println(location + " stereo is off!");
    }
    public void setCD() {
        System.out.println(location + " stereo is set for CD input");
    }
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println(location + " stereo volume set to " + volume);
    }
}
