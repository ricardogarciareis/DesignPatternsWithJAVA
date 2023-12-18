package com.dzrrcreations.designpatterns.BridgeDesignPattern.classes;

import com.dzrrcreations.designpatterns.BridgeDesignPattern.abstractclasses.EntertainmentDevice;
import com.dzrrcreations.designpatterns.BridgeDesignPattern.abstractclasses.RemoteButton;

public class TVRemoteMute extends RemoteButton {

	public TVRemoteMute(EntertainmentDevice newDevice) {
		super(newDevice);
	}

	@Override
	public void buttonNinePressed() {
		System.out.println("TV was Muted");
	}

}
