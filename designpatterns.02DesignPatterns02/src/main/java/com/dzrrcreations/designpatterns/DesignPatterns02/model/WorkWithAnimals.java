package com.dzrrcreations.designpatterns.DesignPatterns02.model;

public class WorkWithAnimals {
	
	public WorkWithAnimals() {
		
	}
	
	public void createDog(String dogName, int dogWeight) {
		Dog fido = new Dog();
		fido.setName(dogName);
		fido.setWeight(dogWeight);
		System.out.println("Dog name: " + fido.getName());
		System.out.println(fido.getName() + " weight: " + fido.getWeight());
		System.out.println(fido.getName() + " " + fido.digHole());
		
		changeObjectName(fido);
		System.out.println("Dog name: " + fido.getName());
	}
	
	public static void changeObjectName(Dog fido) {
		fido.setName("Marcus");
	}

	
	
}
