package com.dzrrcreations.designpatterns.CommandDesignPattern.classes;

import com.dzrrcreations.designpatterns.CommandDesignPattern.interfaces.Command;
import com.dzrrcreations.designpatterns.CommandDesignPattern.interfaces.ElectronicDevice;

public class TurnDeviceVolumeUp implements Command {
	
	//Delegate - Dependency Injection
	ElectronicDevice theDevice;

	public TurnDeviceVolumeUp(ElectronicDevice theNewDevice) {
		super();
		this.theDevice = theNewDevice;
	}

	@Override
	public void execute() {
		this.theDevice.volumeUp();
	}

	@Override
	public void undo() {
		this.theDevice.volumeDown();
	}

}
