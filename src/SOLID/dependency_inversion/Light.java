package SOLID.dependency_inversion;
import SOLID.dependency_inversion.Switchable;

public class Light implements Switchable {
    public void turnOn() {
        System.out.println("Light is ON.");
    }

    public void turnOff() {
        System.out.println("Light is OFF.");
    }
}
