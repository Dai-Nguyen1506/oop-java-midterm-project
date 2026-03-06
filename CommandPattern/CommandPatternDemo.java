import Command.RemoteControl;
import Command.Commands.*;
import Command.Devices.*;

// Main Class for Command Pattern
public class CommandPatternDemo {
    public static void main(String[] args) {

        // Create receivers
        TV tv = new TV();
        Stereo stereo = new Stereo();

        // Create commands
        Command turnOnTV = new TurnOnCommand(tv);
        Command turnOffTV = new TurnOffCommand(tv);
        Command adjustVolume = new AdjustVolumeCommand(stereo);
        Command changeChannel = new ChangeChannelCommand(tv);

        // Create invoker
        RemoteControl remote = new RemoteControl();

        // Execute commands
        remote.setCommand(turnOnTV);
        remote.pressButton();

        remote.setCommand(adjustVolume);
        remote.pressButton();

        remote.setCommand(changeChannel);
        remote.pressButton();

        remote.setCommand(turnOffTV);
        remote.pressButton();
    }
}