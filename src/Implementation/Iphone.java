package Implementation;

import API.Receiver;

public class Iphone implements Receiver {
    int volume = 0;

    @Override
    public void on() {
        System.out.println("My Iphone turns on");
    }

    @Override
    public void off() {
        System.out.println("My Iphone turns off");
    }

    @Override
    public void turnVolumeUp() {
        volume++;
        System.out.println("My Iphone volume is at : " + volume);
    }

    @Override
    public void turnVolumeDown() {
        volume--;
        System.out.println("My Iphone volume is at : " + volume);
    }
}
