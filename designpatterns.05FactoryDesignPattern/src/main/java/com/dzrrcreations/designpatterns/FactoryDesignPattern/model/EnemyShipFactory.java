package com.dzrrcreations.designpatterns.FactoryDesignPattern.model;

public class EnemyShipFactory {


	
	public EnemyShip makeEnemyShip(String newShipType) {
		EnemyShip newShip = null;
		if(newShipType.equalsIgnoreCase("u")) {
			return new UFOEnemyShip();
		} else if(newShipType.equalsIgnoreCase("r")) {
			return new RocketEnemyShip();
		} else if(newShipType.equalsIgnoreCase("b")) {
			return new BigUFOEnemyShip();
		} else return null;
	}
	
	
}
