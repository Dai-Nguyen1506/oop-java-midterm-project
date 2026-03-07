// No Command Pattern - Direct coupling between invoker and receivers

// Device classes (Receivers)
class TVNoCommand {
    public void turnOn() {
        System.out.println("TV is now on");
    }

    public void turnOff() {
        System.out.println("TV is now off");
    }

    public void changeChannel() {
        System.out.println("Channel changed");
    }
}

class StereoNoCommand {
    public void turnOn() {
        System.out.println("Stereo is now on");
    }

    public void turnOff() {
        System.out.println("Stereo is now off");
    }

    public void adjustVolume() {
        System.out.println("Volume adjusted");
    }
}

// Remote Control without Command Pattern
class RemoteControlNoCommand {
    private TVNoCommand tv;
    private StereoNoCommand stereo;

    public RemoteControlNoCommand(TVNoCommand tv, StereoNoCommand stereo) {
        this.tv = tv;
        this.stereo = stereo;
    }

    // Problem: Remote must know about all devices and all operations
    // Each new operation requires a new method in RemoteControl
    public void turnOnTV() {
        if (tv != null) {
            tv.turnOn();
        }
    }

    public void turnOffTV() {
        if (tv != null) {
            tv.turnOff();
        }
    }

    public void changeChannelTV() {
        if (tv != null) {
            tv.changeChannel();
        }
    }

    public void turnOnStereo() {
        if (stereo != null) {
            stereo.turnOn();
        }
    }

    public void turnOffStereo() {
        if (stereo != null) {
            stereo.turnOff();
        }
    }

    public void adjustVolumeStereo() {
        if (stereo != null) {
            stereo.adjustVolume();
        }
    }

    // Problem: Cannot easily add new devices or operations
    // Cannot store history of operations
    // Cannot implement undo/redo functionality
}

// Alternative approach: Using integers or strings to identify operations
class RemoteControlWithCodesNoCommand {
    private TVNoCommand tv;
    private StereoNoCommand stereo;

    public RemoteControlWithCodesNoCommand(TVNoCommand tv, StereoNoCommand stereo) {
        this.tv = tv;
        this.stereo = stereo;
    }

    // Problem: Hard to maintain, error-prone, uses magic numbers/strings
    public void pressButton(int deviceCode, int operationCode) {
        if (deviceCode == 1) { // TV
            if (operationCode == 1) {
                tv.turnOn();
            } else if (operationCode == 2) {
                tv.turnOff();
            } else if (operationCode == 3) {
                tv.changeChannel();
            }
        } else if (deviceCode == 2) { // Stereo
            if (operationCode == 1) {
                stereo.turnOn();
            } else if (operationCode == 2) {
                stereo.turnOff();
            } else if (operationCode == 3) {
                stereo.adjustVolume();
            }
        }
    }
}

// Driver Code - Shows the problem without Command Pattern
public class NoCommandPattern {
    public static void main(String[] args) {
        System.out.println("=== Without Command Pattern ===\n");

        // Create devices
        TVNoCommand tv = new TVNoCommand();
        StereoNoCommand stereo = new StereoNoCommand();

        System.out.println("Approach 1: Specific methods for each operation");
        RemoteControlNoCommand remote1 = new RemoteControlNoCommand(tv, stereo);
        remote1.turnOnTV();
        remote1.adjustVolumeStereo();
        remote1.changeChannelTV();
        remote1.turnOffTV();

        System.out.println("\nApproach 2: Using codes to identify operations");
        RemoteControlWithCodesNoCommand remote2 = new RemoteControlWithCodesNoCommand(tv, stereo);
        remote2.pressButton(1, 1); // Turn on TV
        remote2.pressButton(2, 3); // Adjust volume on Stereo
        remote2.pressButton(1, 3); // Change channel on TV
        remote2.pressButton(1, 2); // Turn off TV

        System.out.println("\n=== Problems without Command Pattern ===");
        System.out.println("1. Tight coupling between invoker (remote) and receivers (devices)");
        System.out.println("2. Hard to add new devices or operations - requires modifying remote class");
        System.out.println("3. Cannot easily parameterize objects with operations");
        System.out.println("4. Cannot queue or log requests");
        System.out.println("5. Cannot implement undo/redo functionality");
        System.out.println("6. Code becomes complex with many if-else statements");
        System.out.println("7. Violates Open/Closed Principle - must modify code to extend");
    }
}
