package com.dzrrcreations.designpatterns.CommandDesignPattern.classes;

import com.dzrrcreations.designpatterns.CommandDesignPattern.interfaces.Command;
import com.dzrrcreations.designpatterns.CommandDesignPattern.interfaces.ElectronicDevice;

public class TurnDeviceOff implements Command {
	
	//Delegate - Dependency Injection
	ElectronicDevice theDevice;

	public TurnDeviceOff(ElectronicDevice theNewDevice) {
		super();
		this.theDevice = theNewDevice;
	}

	@Override
	public void execute() {
		this.theDevice.off();
	}

	@Override
	public void undo() {
		this.theDevice.on();
	}

}
