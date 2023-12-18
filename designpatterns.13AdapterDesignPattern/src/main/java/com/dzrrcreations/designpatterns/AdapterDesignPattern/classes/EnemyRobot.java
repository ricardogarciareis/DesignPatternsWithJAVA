package com.dzrrcreations.designpatterns.AdapterDesignPattern.classes;

import java.util.Random;

//Adaptee
public class EnemyRobot {
	
	//Nothing to do with the pattern
	Random generator = new Random();

	public void smashWithHands() {
		int attackDamage = generator.nextInt(10) + 1;
		System.out.println("Enemy Robot Causes " + attackDamage + " Damage With Its Hands");
	}
	
	public void walksForward() {
		int movement = generator.nextInt(5) + 1;
		System.out.println("Enemy Robot Walks Forward " + movement + " Spaces");
	}
	
	public void reactToHuman(String driverName) {
		System.out.println("Enemy Robot Tramps on " + driverName);
	}
}
