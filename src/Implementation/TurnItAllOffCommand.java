package Implementation;

import API.Command;
import API.Receiver;

import java.util.List;

public class TurnItAllOffCommand implements Command {
    List<Receiver> mesDevices;

    public TurnItAllOffCommand(List<Receiver> mesDevices){
        this.mesDevices = mesDevices;
    }

    @Override
    public void execute() {
        for(Receiver d : mesDevices){
            d.off();
        }
    }

    @Override
    public void undo() {
        for(Receiver d : mesDevices){
            d.on();
        }
    }
}
