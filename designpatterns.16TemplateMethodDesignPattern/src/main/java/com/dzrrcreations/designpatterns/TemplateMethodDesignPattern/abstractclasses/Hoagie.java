package com.dzrrcreations.designpatterns.TemplateMethodDesignPattern.abstractclasses;

public abstract class Hoagie {
	
	public final void makeSandwich() {
		cutBun();
		
		if(customerWantsMeat())
			addMeat();
		if(customerWantsCheese())
			addCheese();
		if(customerWantsVegetables())
			addVegetables();
		if(customerWantsCondiments())
			addCondiments();
		
		wrapTheHoagie();
	}
	
	public void cutBun() {
		System.out.println("The Hoagie is Cut");
	}
	
	public boolean customerWantsMeat() { return true; }
	public abstract void addMeat();
	
	public boolean customerWantsCheese() { return true; }
	public abstract void addCheese();
	
	public boolean customerWantsVegetables() { return true; }
	public abstract void addVegetables();
	
	public boolean customerWantsCondiments() { return true; }
	public abstract void addCondiments();
	
	public void wrapTheHoagie() {
		System.out.println("Wrap the Hoagie");
	}

}
