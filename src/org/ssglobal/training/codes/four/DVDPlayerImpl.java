package org.ssglobal.training.codes.four;

public class DVDPlayerImpl extends MediaPlayer implements DVDPlayer {
	@Override
	public void insertDvd() {
		System.out.println("DVD inserted");
	}

	@Override
	public void ejectDvd() {
		System.out.println("DVD ejected");
	}

	@Override
	public void play() {
		System.out.println("DVD is playing");
	}
}
