package com.dzrrcreations.designpatterns.ChainOfResponsDesignPattern.classes;

import com.dzrrcreations.designpatterns.ChainOfResponsDesignPattern.interfaces.Chain;

public class MultiplyNumbers implements Chain {
	
	private Chain nextInChain;
	
	@Override
	public void setNextChain(Chain nextChain) {
		this.nextInChain = nextChain;
	}

	@Override
	public void calculate(Numbers request) {
		if(request.getCalculationWanted() == "multiply") {
			System.out.println(request.getNumber1() + " * " + request.getNumber2() + " = " + (request.getNumber1() * request.getNumber2()));
		} else {
			this.nextInChain.calculate(request);
		}

	}

}
