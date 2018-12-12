package Implementation;

import API.Receiver;

public class Television implements Receiver {

    private int volume = 0;
    private boolean isOn = false;

    @Override
    public void on() {
        System.out.println("TV is ON");
        isOn = true;
    }

    @Override
    public void off() {
        System.out.println("TV is OFF");
        isOn = false;
    }

    @Override
    public void turnVolumeUp() {
        volume ++;
        System.out.println("TV volume is at : " + volume);
    }

    @Override
    public void turnVolumeDown() {
        volume --;
        System.out.println("TV volume is at : " + volume);
    }
}
