package org.ssglobal.training.codes.four;

public class Main {
    public static void main(String[] args) {
        // Testing DVD Player
        DVDPlayerImpl dvd = new DVDPlayerImpl();
        dvd.insertDvd();
        dvd.play();
        dvd.ejectDvd();
        dvd.stop();

        CDPlayerImpl cd = new CDPlayerImpl();
        cd.insertCd();
        cd.play();
        cd.ejectCd();
        cd.stop();

        USBPlayerImpl usb = new USBPlayerImpl();
        usb.insertUsb();
        usb.play();
        usb.ejectUsb();
        usb.stop();
    }
}



