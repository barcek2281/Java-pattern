package SOLID.dependency_inversion;

import SOLID.dependency_inversion.Switchable;

public class Button {
    private Switchable device;
    public Button(SOLID.dependency_inversion.Switchable device) {
        this.device = device;
    }
    public void press() {
        device.turnOn();
    }
    public void release() {
        device.turnOff();
    }
}
