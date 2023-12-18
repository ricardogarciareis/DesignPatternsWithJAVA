package com.dzrrcreations.designpatterns.CommandDesignPattern.classes;

import com.dzrrcreations.designpatterns.CommandDesignPattern.interfaces.ElectronicDevice;

public class TVRemote {

	public static ElectronicDevice getDevice() {
		return new Television();
	}
}
