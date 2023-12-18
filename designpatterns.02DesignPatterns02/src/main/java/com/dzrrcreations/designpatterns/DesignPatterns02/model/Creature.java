package com.dzrrcreations.designpatterns.DesignPatterns02.model;

public abstract class Creature {

	protected String name;
	protected int weight;
	protected String sound;
	
	public abstract String getName();
	public abstract void setName(String newName);
	
	public abstract int getWeight();
	public abstract void setWeight(int newWeight);
	
	public abstract String getSound();
	public abstract void setSound(String newSound);
	
}
