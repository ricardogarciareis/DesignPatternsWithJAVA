package com.dzrrcreations.designpatterns.BuilderDesignPattern.model;

public class ModernRobotBuilder implements RobotBuilder {
	
	private Robot robot;
	
	public ModernRobotBuilder() {
		this.robot = new Robot();
	}

	@Override
	public void buildRobotHead() {
		robot.setRobotHead("Round Head");
	}

	@Override
	public void buildRobotTorso() {
		robot.setRobotTorso("Round Torso");
	}

	@Override
	public void buildRobotArms() {
		robot.setRobotArms("Articulated Arms");

	}

	@Override
	public void buildRobotLegs() {
		robot.setRobotLegs("Articulated Legs");
	}

	@Override
	public Robot getRobot() {
		return this.robot;
	}

}
