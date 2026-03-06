package Command.Commands;

import Command.Devices.Stereo;

// Concrete Command for adjusting Stereo volume
public class AdjustVolumeCommand implements Command {
    private Stereo stereo;

    public AdjustVolumeCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.adjustVolume();
    }
}