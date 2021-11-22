package CommandPattern.RemoteController2;

public class StereoOffWithCDCommand implements Command{
    Stereo stereo;

    public StereoOffWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
        stereo.volume = 0;
    }
}
