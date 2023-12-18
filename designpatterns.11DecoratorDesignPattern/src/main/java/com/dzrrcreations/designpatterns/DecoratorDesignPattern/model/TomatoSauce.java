package com.dzrrcreations.designpatterns.DecoratorDesignPattern.model;

public class TomatoSauce extends ToppingDecorator {

	public TomatoSauce(Pizza newPizza) {
		super(newPizza);
		System.out.println("Adding Sauce");
	}
	
	public String getDescription() {
		return this.tempPizza.getDescription() + ", Tomato Sauce";
	}

	public double getCost() {
		return this.tempPizza.getCost() + 0.30;
	}

}
