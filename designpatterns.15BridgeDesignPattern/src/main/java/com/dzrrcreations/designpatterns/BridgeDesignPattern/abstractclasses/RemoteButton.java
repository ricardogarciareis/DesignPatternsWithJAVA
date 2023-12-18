package com.dzrrcreations.designpatterns.BridgeDesignPattern.abstractclasses;

public abstract class RemoteButton {
	
	private EntertainmentDevice theDevice;

	public RemoteButton(EntertainmentDevice newDevice) {
		this.theDevice = newDevice;
	}

	public void buttonFivePressed() {
		this.theDevice.buttonFivePressed();
	}

	public void buttonSixPressed() {
		this.theDevice.buttonSixPressed();
	}
	
	public void deviceFeedback() {
		this.theDevice.deviceFeedback();
	}
	
	public void volumeUp() {
		this.theDevice.buttonSevenPressed();
	}
	
	public void volumeDown() {
		this.theDevice.buttonEightPressed();
	}
	
	
	public abstract void buttonNinePressed();
}
