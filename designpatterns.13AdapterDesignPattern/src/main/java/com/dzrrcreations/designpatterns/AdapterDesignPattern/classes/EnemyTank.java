package com.dzrrcreations.designpatterns.AdapterDesignPattern.classes;

import java.util.Random;

import com.dzrrcreations.designpatterns.AdapterDesignPattern.interfaces.EnemyAttacker;

public class EnemyTank implements EnemyAttacker {
	
	//Nothing to do with the pattern
	Random generator = new Random();

	@Override
	public void fireWeapon() {
		int attackDamage = generator.nextInt(10) + 1;
		System.out.println("Enemy Tank Does " + attackDamage + " Damage");
	}

	@Override
	public void driveForward() {
		int movement = generator.nextInt(5) + 1;
		System.out.println("Enemy Tank Moves " + movement + " Spaces Forward");
	}

	@Override
	public void assignDriver(String driverName) {
		System.out.println(driverName + " is Driving the Enemy Tank");
	}

}
