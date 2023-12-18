package com.dzrrcreations.designpatterns.BridgeDesignPattern.classes;

import com.dzrrcreations.designpatterns.BridgeDesignPattern.abstractclasses.EntertainmentDevice;

public class DVDDevice extends EntertainmentDevice {

	public DVDDevice(int newDeviceState, int newMaxSetting) {
		this.deviceState = newDeviceState;
		this.maxSetting = newMaxSetting;
	}

	@Override
	public void buttonFivePressed() {
		System.out.println("Previous Movie");
		this.deviceState--;
	}

	@Override
	public void buttonSixPressed() {
		System.out.println("Next Movie");
		this.deviceState++;
	}

}
