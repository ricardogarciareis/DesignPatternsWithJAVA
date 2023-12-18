package com.dzrrcreations.designpatterns.CommandDesignPattern.classes;

import com.dzrrcreations.designpatterns.CommandDesignPattern.interfaces.ElectronicDevice;

public class RadioRemote {

	public static ElectronicDevice getDevice() {
		return new Radio();
	}
}
