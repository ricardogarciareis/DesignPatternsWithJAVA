package com.dzrrcreations.designpatterns.StrategyDesignPattern.model;

public class Bird extends Animal {

	public Bird() {
		super();
		setSound("Tweet");
		flyingType = new ItFlys();
	}
	
}
