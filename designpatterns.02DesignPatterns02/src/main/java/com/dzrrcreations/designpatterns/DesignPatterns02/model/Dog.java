package com.dzrrcreations.designpatterns.DesignPatterns02.model;

public class Dog extends Animal {
	
	public Dog() {
		super();
		setSound("Bark");
	}

	public String digHole() {
		return "dugs a hole";
	}
	
	private void bePrivate() {
		System.out.println("I'm Private!!!");
	}
	
	public void accessPrivate() {
		bePrivate();
	}
	
}
