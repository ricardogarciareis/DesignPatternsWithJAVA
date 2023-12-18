package com.dzrrcreations.designpatterns.AbstractFactoryDesignPattern.model;

public abstract class EnemyShip {

	private String name;
	ESWeapon weapon;
	ESEngine engine;
	ESMissile missile;
	
	public String getName() { return this.name; }
	public void setName(String newName) { this.name = newName; }
	
	abstract void makeShip();
	
	public String toString() {
		String infoOnShip = "The " + this.getName() + " has a top speed of " + this.engine + " causing a damage of "+ this.weapon;
		return infoOnShip;
	}
	
	public void followHeroShip() {
		System.out.println(getName() + " is following the hero ship");
	}
	
	public void displayEnemyShip() {
		if(this.missile != null)
			System.out.println(getName() + " is on the screen - ready to shoot " + this.missile);
	}
	
	public void enemyShipShoots() {
		System.out.println(getName() + " attacks and does " + this.weapon);
	}
}
