package com.dzrrcreations.designpatterns.DecoratorDesignPattern.model;

public abstract class ToppingDecorator implements Pizza {
	
	protected Pizza tempPizza;
	
	public ToppingDecorator(Pizza newPizza) {
		this.tempPizza = newPizza;
	}

	@Override
	public String getDescription() {
		return this.tempPizza.getDescription();
	}

	@Override
	public double getCost() {
		return this.tempPizza.getCost();
	}

}
