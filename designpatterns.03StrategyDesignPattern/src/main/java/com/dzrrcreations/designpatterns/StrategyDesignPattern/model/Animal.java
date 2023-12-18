package com.dzrrcreations.designpatterns.StrategyDesignPattern.model;

public class Animal {

	private String name;
	private double height;
	private int weight;
	private String favFood;
	private double speed;
	private String sound;
	
	//Composition
	public Flys flyingType;
	
	public String tryToFly() {
		return flyingType.fly();
	}
	
	public void setFlyingAbility(Flys newFlyType) {
		this.flyingType = newFlyType;
	}
	
	
	//Getters and Setters
	public String getName() { return this.name; }
	public void setName(String newName) { this.name = newName; }
	
	public double getHeight() { return this.height; }
	public void setHeight(double newHeight) { this.height = newHeight; }
	
	public int getWeight() { return this.weight; }
	public void setWeight(int newWeight) {
		if(newWeight > 0) {
			this.weight = newWeight;
		} else {
			System.out.println("Weight must be bigger than 0");
		}
	}
	
	public String getFavFood() { return this.favFood; }
	public void setFavFood(String newFavFood) { this.favFood = newFavFood; }
	
	public double getSpeed() { return this.speed; }
	public void setSpeed(double newSpeed) { this.speed = newSpeed; }
	
	public String getSound() { return this.sound; }
	public void setSound(String newSound) { this.sound = newSound; }

}
