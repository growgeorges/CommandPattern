package Main;

import API.Command;
import API.Invoker;
import API.Receiver;
import Implementation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args){
        //ceci est mon client

        Receiver maTv = new Television();
        Receiver monIphone = new Iphone();

        Command turnTvOn = new TurnOnCommand(maTv);
        Command turnIphoneOn = new TurnOnCommand(monIphone);

        Invoker grosBoutonPoussoirVertDeLaTv = new DeviceButton(turnTvOn);
        Invoker petitBoutonOnSurLeCote = new DeviceButton(turnIphoneOn);

        grosBoutonPoussoirVertDeLaTv.press();
        petitBoutonOnSurLeCote.press();

        Command turnTvOff = new TurnOffCommand(maTv);
        Command turnIphoneOff = new TurnOffCommand(monIphone);

        Invoker grosBoutonPoussoirRougeDeLaTv = new DeviceButton(turnTvOff);
        Invoker petitBoutonOffSurLeCote = new DeviceButton(turnIphoneOff);

        grosBoutonPoussoirRougeDeLaTv.press();
        petitBoutonOffSurLeCote.press();

        Command turnTvVolumeUp = new TurnVolumeUp(maTv);
        Command turnIphoneVolumeUp = new TurnVolumeUp(monIphone);

        Invoker potentiometreVersLaDroite = new DeviceButton(turnTvVolumeUp);
        Invoker boutonPlusSurLeCote = new DeviceButton(turnIphoneVolumeUp);

        potentiometreVersLaDroite.press();
        potentiometreVersLaDroite.press();
        potentiometreVersLaDroite.press();

        boutonPlusSurLeCote.press();
        boutonPlusSurLeCote.press();

        Command turnEverythingOff = new TurnItAllOffCommand(new ArrayList<>(Arrays.asList(maTv, monIphone)));

        Invoker masterSwitch = new DeviceButton(turnEverythingOff);

        masterSwitch.press();
        masterSwitch.pressUndo();

    }
}
