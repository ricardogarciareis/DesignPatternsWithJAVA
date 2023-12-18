package com.dzrrcreations.designpatterns.DesignPatterns01.model;

public class Dog extends Animal {
	
	public Dog() {
		super();
		setSound("Bark");
	}

	public String digHole() {
		return "dugs a hole";
	}
	
	public void changeVar(int randNum) {
		randNum = 12;
		System.out.println("RandNum in method: " + randNum);
	}

}
