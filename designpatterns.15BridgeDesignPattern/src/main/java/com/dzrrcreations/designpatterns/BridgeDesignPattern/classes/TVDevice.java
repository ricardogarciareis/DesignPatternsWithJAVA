package com.dzrrcreations.designpatterns.BridgeDesignPattern.classes;

import com.dzrrcreations.designpatterns.BridgeDesignPattern.abstractclasses.EntertainmentDevice;

public class TVDevice extends EntertainmentDevice {

	public TVDevice(int newDeviceState, int newMaxSetting) {
		this.deviceState = newDeviceState;
		this.maxSetting = newMaxSetting;
	}

	@Override
	public void buttonFivePressed() {
		System.out.println("Channel Down");
		this.deviceState--;
	}

	@Override
	public void buttonSixPressed() {
		System.out.println("Channel Up");
		this.deviceState++;
	}

}
