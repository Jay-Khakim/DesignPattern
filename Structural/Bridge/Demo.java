package Bridge;

import Bridge.devices.Device;
import Bridge.devices.Radio;
import Bridge.devices.TV;
import Bridge.remotes.AdvancedRemote;
import Bridge.remotes.BasicRemote;

public class Demo {
    public static void main(String[] args){
        testDevice(new TV());
        testDevice(new Radio());

    }

    public static void testDevice(Device device){
        System.out.println("Test with basic remote");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
