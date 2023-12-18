package com.dzrrcreations.designpatterns.CommandDesignPattern.classes;

import com.dzrrcreations.designpatterns.CommandDesignPattern.interfaces.Command;

//Invoker
public class DeviceButton {

	Command theCommand;

	public DeviceButton(Command theNewCommand) {
		super();
		this.theCommand = theNewCommand;
	}
	
	public void press() {
		this.theCommand.execute();
	}
	
	public void undo() {
		this.theCommand.undo();
	}
	
}
