package com.dzrrcreations.designpatterns.BuilderDesignPattern.model;

public class Robot implements RobotPlan {
	
	private String robotHead;
	private String robotTorso;
	private String robotArms;
	private String robotLegs;
	
	
	@Override
	public void setRobotHead(String head) { this.robotHead = head; }
	
	public String getRobotHead() { return this.robotHead; }

	@Override
	public void setRobotTorso(String torso) { this.robotTorso = torso; }
	
	public String getRobotTorso() { return this.robotTorso; }

	@Override
	public void setRobotArms(String arms) { this.robotArms = arms; }
	
	public String getRobotArms() { return this.robotArms; }

	@Override
	public void setRobotLegs(String legs) { this.robotLegs = legs; }
	
	public String getRobotLegs() { return this.robotLegs; }

}
