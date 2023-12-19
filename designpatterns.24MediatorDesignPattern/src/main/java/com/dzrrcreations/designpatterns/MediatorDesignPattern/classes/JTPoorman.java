package com.dzrrcreations.designpatterns.MediatorDesignPattern.classes;

import com.dzrrcreations.designpatterns.MediatorDesignPattern.abstractclasses.Colleague;
import com.dzrrcreations.designpatterns.MediatorDesignPattern.interfaces.Mediator;

public class JTPoorman extends Colleague {

	public JTPoorman(Mediator mediator) {
		super(mediator);
		System.out.println("JT Poorman signed up for the exchange\n");
	}
}
