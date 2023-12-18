package com.dzrrcreations.designpatterns.CommandDesignPattern.classes;

import com.dzrrcreations.designpatterns.CommandDesignPattern.interfaces.Command;
import com.dzrrcreations.designpatterns.CommandDesignPattern.interfaces.ElectronicDevice;

public class TurnDeviceVolumeDown implements Command {
	
	//Delegate - Dependency Injection
	ElectronicDevice theDevice;

	public TurnDeviceVolumeDown(ElectronicDevice theNewDevice) {
		super();
		this.theDevice = theNewDevice;
	}

	@Override
	public void execute() {
		this.theDevice.volumeDown();
	}

	@Override
	public void undo() {
		this.theDevice.volumeUp();
	}

}
