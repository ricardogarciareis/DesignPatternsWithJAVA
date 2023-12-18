package com.dzrrcreations.designpatterns.JavaReflection.model;

public class UFOEnemyShip extends EnemyShip {
	
	private String idCode = "100";
	
	private String getPrivate() { return "How did you get his?"; }
	
	private String getOtherPrivate(int thisInt, String thatString) { 
		return "How did you get here? " + thisInt + " " + thatString; 
	}
	
	public UFOEnemyShip(int number, String randString) {
		System.out.println("You sent: " + number + " " + randString);
	}

	/*
	 * We define the type of ship we want to create by stating we want to use the
	 * factory that makes enemy ships
	 */
	
	EnemyShipFactory shipFactory;
	
	/*
	 * The enemy ship required parts list is sent to this method. They state that
	 * the enemy ship must have a weapon and engine assigned. That object also
	 * states the specific parts needed to make a regular UFO versus a Boss UFO
	 */
	
	public UFOEnemyShip(EnemyShipFactory shipFactory) {
		this.shipFactory = shipFactory;
	}
	
	void makeShip() {
		System.out.println("Making enemy ship " + getName());
	}
}
