package com.dzrrcreations.designpatterns.AbstractFactoryDesignPattern.model;

public interface EnemyShipFactory {

	public ESWeapon addESGun();
	public ESEngine addESEngine();
	//Esta factory não produz misseis
}
