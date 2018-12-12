package Implementation;

import API.Command;
import API.Receiver;

public class TurnVolumeUp implements Command {
    Receiver monDevice;

    public TurnVolumeUp(Receiver monDevice){
        this.monDevice = monDevice;
    }

    @Override
    public void execute() {
        monDevice.turnVolumeUp();
    }

    @Override
    public void undo() {
        monDevice.turnVolumeUp();
    }
}
