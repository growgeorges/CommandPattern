package Implementation;

import API.Command;
import API.Receiver;

public class TurnOffCommand implements Command {
    Receiver monDevice;

    public TurnOffCommand(Receiver monDevice){
        this.monDevice = monDevice;
    }

    @Override
    public void execute() {
        monDevice.off();
    }

    @Override
    public void undo() {
        monDevice.on();
    }
}
