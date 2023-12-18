package com.dzrrcreations.designpatterns.CommandDesignPattern.classes;

import com.dzrrcreations.designpatterns.CommandDesignPattern.interfaces.Command;
import com.dzrrcreations.designpatterns.CommandDesignPattern.interfaces.ElectronicDevice;

public class TurnDeviceOn implements Command {
	
	//Delegate - Dependency Injection
	ElectronicDevice theDevice;

	public TurnDeviceOn(ElectronicDevice theNewDevice) {
		super();
		this.theDevice = theNewDevice;
	}

	@Override
	public void execute() {
		this.theDevice.on();
	}

	@Override
	public void undo() {
		this.theDevice.off();
	}

}
