package com.dzrrcreations.designpatterns.AbstractFactoryDesignPattern.model;

public class UFOEnemyShipFactory implements EnemyShipFactory {

	@Override
	public ESWeapon addESGun() {
		return new ESUFOGun();
	}
	
	@Override
	public ESEngine addESEngine() {
		return new ESUFOEngine();
	}

}
