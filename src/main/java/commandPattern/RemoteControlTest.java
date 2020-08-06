package commandPattern;

import commandPattern.command.LightOnCommand;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand liggtOn = new LightOnCommand(light);

        remote.setCommand(liggtOn);
        remote.buttonWasPressed();
    }
}
