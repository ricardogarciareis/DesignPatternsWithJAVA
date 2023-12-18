package com.dzrrcreations.designpatterns.AbstractFactoryDesignPattern.model;

public class UFOEnemyShip extends EnemyShip {
	
	EnemyShipFactory shipFactory;

	public UFOEnemyShip(EnemyShipFactory newShipFactory) {
		this.shipFactory = newShipFactory;
	}

	@Override
	void makeShip() {
		System.out.println("Making enemy ship " + super.getName());
		super.weapon = shipFactory.addESGun();
		super.engine = shipFactory.addESEngine();
		
	}
}
