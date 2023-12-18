package com.dzrrcreations.designpatterns.BridgeDesignPattern.abstractclasses;

public abstract class EntertainmentDevice {
	
	public int deviceState;
	public int maxSetting;
	public int volumeLevel = 0;

	public abstract void buttonFivePressed();
	public abstract void buttonSixPressed();
	
	public void deviceFeedback() {
		if(this.deviceState > this.maxSetting || this.deviceState < 0) { this.deviceState = 0; }
		System.out.println("On " + this.deviceState);
	}
	
	public void buttonSevenPressed() {
		this.volumeLevel++;
		System.out.println("Volume: " + this.volumeLevel);
	}
	
	public void buttonEightPressed() {
		this.volumeLevel--;
		System.out.println("Volume: " + this.volumeLevel);
	}

}
