package com.dzrrcreations.designpatterns.AbstractFactoryDesignPattern.model;

public class UFOBossEnemyShip extends EnemyShip {

	BossEnemyShipFactory shipFactory;

	public UFOBossEnemyShip(BossEnemyShipFactory newShipFactory) {
		this.shipFactory = newShipFactory;
	}
	
	@Override
	void makeShip() {
		System.out.println("Making enemy ship " + super.getName());
		super.weapon = shipFactory.addESGun();
		super.engine = shipFactory.addESEngine();
		super.missile = shipFactory.addESMissile();
	}



}
