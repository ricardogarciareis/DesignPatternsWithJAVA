package com.dzrrcreations.designpatterns.AbstractFactoryDesignPattern.model;

public interface BossEnemyShipFactory {

	public ESWeapon addESGun();
	public ESEngine addESEngine();
	public ESMissile addESMissile();
}
