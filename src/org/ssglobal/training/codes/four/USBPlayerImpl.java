package org.ssglobal.training.codes.four;

public class USBPlayerImpl extends MediaPlayer implements USBPlayer {
	@Override
	public void insertUsb() {
		System.out.println("USB inserted");
	}

	@Override
	public void ejectUsb() {
		System.out.println("USB ejected");
	}

	@Override
	public void play() {
		System.out.println("USB is playing");
	}
}
