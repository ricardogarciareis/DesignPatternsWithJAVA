package com.dzrrcreations.designpatterns.MediatorDesignPattern.classes;

import com.dzrrcreations.designpatterns.MediatorDesignPattern.abstractclasses.Colleague;
import com.dzrrcreations.designpatterns.MediatorDesignPattern.interfaces.Mediator;

public class GormanSlacks extends Colleague {

	public GormanSlacks(Mediator mediator) {
		super(mediator);
		System.out.println("Gorman Slacks signed up for the exchange\n");
	}
}
