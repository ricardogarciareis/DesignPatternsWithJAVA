package com.dzrrcreations.designpatterns.AdapterDesignPattern.classes;

import com.dzrrcreations.designpatterns.AdapterDesignPattern.interfaces.EnemyAttacker;

//Adapter
public class EnemyRobotAdapter implements EnemyAttacker {
	
	EnemyRobot theRobot;

	public EnemyRobotAdapter(EnemyRobot theNewRobot) {
		super();
		this.theRobot = theNewRobot;
	}

	@Override
	public void fireWeapon() {
		this.theRobot.smashWithHands();
	}

	@Override
	public void driveForward() {
		this.theRobot.walksForward();
	}

	@Override
	public void assignDriver(String driverName) {
		this.theRobot.reactToHuman(driverName);
	}

}
