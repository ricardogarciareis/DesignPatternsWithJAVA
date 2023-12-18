package com.dzrrcreations.designpatterns.ChainOfResponsDesignPattern.interfaces;

import com.dzrrcreations.designpatterns.ChainOfResponsDesignPattern.classes.Numbers;

public interface Chain {

	public void setNextChain(Chain nextChain);
	public void calculate(Numbers request);
}
