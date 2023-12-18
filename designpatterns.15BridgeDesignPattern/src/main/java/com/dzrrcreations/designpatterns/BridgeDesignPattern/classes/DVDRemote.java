package com.dzrrcreations.designpatterns.BridgeDesignPattern.classes;

import com.dzrrcreations.designpatterns.BridgeDesignPattern.abstractclasses.EntertainmentDevice;
import com.dzrrcreations.designpatterns.BridgeDesignPattern.abstractclasses.RemoteButton;

public class DVDRemote extends RemoteButton {

	public DVDRemote(EntertainmentDevice newDevice) {
		super(newDevice);
	}

	@Override
	public void buttonNinePressed() {
		System.out.println("DVD special function");
	}

}
