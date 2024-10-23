package assigment4.task2;

public class LightOffCommand implements Command{
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }


    public void execute() {
        light.turnOff();
    }
}