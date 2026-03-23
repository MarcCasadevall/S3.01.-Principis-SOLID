package devices;

import interfaces.MachineOff;
import interfaces.MachineOn;
import interfaces.MachineWash;

public class WashingMachine implements MachineOn, MachineOff, MachineWash {
    @Override
    public void turnOff() {
        System.out.println("WashingMachine is OFF");
    }

    @Override
    public void turnOn() {
        System.out.println("WashingMachine is ON");
    }

    @Override
    public void wash() {
        System.out.println("WashingMachine is washing clothes.");
    }
}
