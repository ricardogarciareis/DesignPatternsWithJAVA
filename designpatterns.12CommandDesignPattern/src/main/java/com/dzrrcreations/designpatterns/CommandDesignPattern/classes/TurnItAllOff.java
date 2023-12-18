package com.dzrrcreations.designpatterns.CommandDesignPattern.classes;

import java.util.List;

import com.dzrrcreations.designpatterns.CommandDesignPattern.interfaces.Command;
import com.dzrrcreations.designpatterns.CommandDesignPattern.interfaces.ElectronicDevice;

public class TurnItAllOff implements Command {
	
	List<ElectronicDevice> allDevices;

	public TurnItAllOff(List<ElectronicDevice> allNewDevices) {
		super();
		this.allDevices = allNewDevices;
	}

	@Override
	public void execute() {
		this.allDevices.stream().forEach(d -> d.off());
	}

	@Override
	public void undo() {
		this.allDevices.stream().forEach(d -> d.on());
	}

}
