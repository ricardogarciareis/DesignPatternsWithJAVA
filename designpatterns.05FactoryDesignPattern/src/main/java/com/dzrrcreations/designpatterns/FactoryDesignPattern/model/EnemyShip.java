package com.dzrrcreations.designpatterns.FactoryDesignPattern.model;

public abstract class EnemyShip {

	private String name;
	private double amtDamage;
	
	public String getName() { return this.name; }
	public void setName(String newName) { this.name = newName; }
	
	public double getAmtDamage() { return this.amtDamage; }
	public void setAmtDamage(double newAmtDamage) { this.amtDamage = newAmtDamage; }
	
	public void followHeroShip() {
		System.out.println(getName() + " is following the hero ship");
	}
	
	public void displayEnemyShip() {
		System.out.println(getName() + " is on the screen");
	}
	
	public void enemyShipShoots() {
		System.out.println(getName() + " attacks and does " + getAmtDamage());
	}
}
