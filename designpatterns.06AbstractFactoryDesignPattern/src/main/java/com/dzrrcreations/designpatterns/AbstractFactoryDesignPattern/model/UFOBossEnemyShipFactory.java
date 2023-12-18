package com.dzrrcreations.designpatterns.AbstractFactoryDesignPattern.model;

public class UFOBossEnemyShipFactory implements BossEnemyShipFactory {

	@Override
	public ESWeapon addESGun() {
		return new ESUFOBossGun();
	}

	@Override
	public ESEngine addESEngine() {
		return new ESUFOBossEngine();
	}
	
	@Override
	public ESMissile addESMissile() {
		return new ESUFOMissile();
	}
}
