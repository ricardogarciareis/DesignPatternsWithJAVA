package com.dzrrcreations.designpatterns.PrototypeDesignPattern.model;

public class CloneFactory {

	public Animal getClone(Animal animalSample) {
		
		return animalSample.makeCopy();
	}
}
