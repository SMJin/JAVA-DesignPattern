package CommandPattern.RemoteController2;

public class NoCommand implements Command{
    @Override
    public void execute() {
        System.out.println("NO COMMAND");
    }
}
