package com.dzrrcreations.designpatterns.ProxyDesignPattern.classes;

import com.dzrrcreations.designpatterns.ProxyDesignPattern.interfaces.ATMState;
import com.dzrrcreations.designpatterns.ProxyDesignPattern.interfaces.GetATMData;

public class ATMProxy implements GetATMData {

	@Override
	public ATMState getATMData() {
		ATMMachine realATMMachine = new ATMMachine();
		return realATMMachine.getATMData();
	}

	@Override
	public int getCashInMachine() {
		ATMMachine realATMMachine = new ATMMachine();
		return realATMMachine.getCashInMachine();
	}

}
