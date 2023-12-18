package com.dzrrcreations.designpatterns.StateDesignPattern.interfaces;

//Possible User Actions
public interface ATMState {
	
	void insertCard();
	void ejectCard();
	void insertPin(int pinEntered);
	void requestCash(int cashToWithdraw);
	void depositCash(int cashToDeposit);
	void checkAccount();
}
