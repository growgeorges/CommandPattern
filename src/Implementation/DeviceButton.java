package Implementation;

import API.Command;
import API.Invoker;

public class DeviceButton implements Invoker {
    Command theCommand;

    public DeviceButton(Command theCommand){
        this.theCommand = theCommand;
    }

    @Override
    public void press() {
        theCommand.execute();
    }

    @Override
    public void pressUndo() {
        theCommand.undo();
    }
}
