package org.ssglobal.training.codes.four;

public class CDPlayerImpl extends MediaPlayer implements CDPlayer {
	@Override
	public void insertCd() {
		System.out.println("CD inserted");
	}

	@Override
	public void ejectCd() {
		System.out.println("CD ejected");
		
	}
	
	@Override
	public void play() {
		 System.out.println("CD is playing");
	}
}
