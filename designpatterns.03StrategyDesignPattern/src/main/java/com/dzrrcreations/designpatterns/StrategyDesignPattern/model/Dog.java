package com.dzrrcreations.designpatterns.StrategyDesignPattern.model;

public class Dog extends Animal {
	
	public Dog() {
		super();
		setSound("Bark");
		flyingType = new CantFly();
	}

	public String digHole() {
		return " dugs a hole";
	}
	

}
