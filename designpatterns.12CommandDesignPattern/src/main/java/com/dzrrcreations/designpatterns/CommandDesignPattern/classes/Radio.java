package com.dzrrcreations.designpatterns.CommandDesignPattern.classes;

import com.dzrrcreations.designpatterns.CommandDesignPattern.interfaces.ElectronicDevice;

//Receiver
public class Radio implements ElectronicDevice {
	
	private int volume = 0;

	@Override
	public void on() {
		System.out.println(this.getClass().getSimpleName() + " is ON");
	}

	@Override
	public void off() {
		System.out.println(this.getClass().getSimpleName() + " is OFF");
	}

	@Override
	public void volumeUp() {
		this.volume++;
		System.out.println(this.getClass().getSimpleName() + " Volume is at " + this.volume);
	}

	@Override
	public void volumeDown() {
		this.volume--;
		System.out.println(this.getClass().getSimpleName() + " Volume is at " + this.volume);
	}

}
