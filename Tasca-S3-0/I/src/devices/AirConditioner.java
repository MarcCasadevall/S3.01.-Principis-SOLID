package devices;

import interfaces.MachineCool;
import interfaces.MachineHeat;
import interfaces.MachineOff;
import interfaces.MachineOn;

public class AirConditioner implements MachineOn, MachineOff, MachineCool, MachineHeat {
    @Override
    public void cool() {
        System.out.println("AirConditioner is cooling.");
    }

    @Override
    public void heat() {
        System.out.println("AirConditioner is heating.");
    }

    @Override
    public void turnOff() {
        System.out.println("AirConditioner is OFF");
    }

    @Override
    public void turnOn() {
        System.out.println("AirConditioner is ON");
    }
}
