package com.dzrrcreations.designpatterns.DecoratorDesignPattern.model;

public class Mozzarella extends ToppingDecorator{

	public Mozzarella(Pizza newPizza) {
		super(newPizza);
		System.out.println("Adding Dough");
		System.out.println("Adding Cheese");
	}
	
	public String getDescription() {
		return this.tempPizza.getDescription() + ", Mozzarella";
	}

	public double getCost() {
		return this.tempPizza.getCost() + 0.55;
	}

}
