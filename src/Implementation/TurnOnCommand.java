package Implementation;

import API.Command;
import API.Receiver;

public class TurnOnCommand implements Command {
    Receiver monDevice;

    public TurnOnCommand(Receiver monDevice){
        this.monDevice=monDevice;
    }

    @Override
    public void execute() {
        monDevice.on();
    }

    @Override
    public void undo() {
        monDevice.off();
    }
}
