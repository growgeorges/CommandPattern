package Implementation;

import API.Command;
import API.Receiver;

public class TurnVolumeDown implements Command {
    Receiver monDevice;

    public TurnVolumeDown(Receiver monDevice){
        this.monDevice = monDevice;
    }

    @Override
    public void execute() {
        monDevice.turnVolumeDown();
    }

    @Override
    public void undo() {
        monDevice.turnVolumeUp();
    }
}
