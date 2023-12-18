package com.dzrrcreations.designpatterns.StateDesignPattern.classes;

import com.dzrrcreations.designpatterns.StateDesignPattern.interfaces.ATMState;

//Context (Account)
public class ATMMachine {
	
	private ATMState hasCard;
	private ATMState noCard;
	private ATMState hasCorrectPin;
	private ATMState atmOutOfMoney;
	
	private ATMState atmState;
	
	public int cashInMachine = 2000;
	public boolean correctPinEntered = false;
	
	public ATMMachine() {
		this.hasCard = new HasCard(this);
		this.noCard = new NoCard(this);
		this.hasCorrectPin = new HasPin(this);
		this.atmOutOfMoney = new NoCash(this);
		
		this.atmState = noCard;
		
		if(cashInMachine < 0) {
			atmState = atmOutOfMoney;
		}
	}
	
	void setATMState(ATMState newATMState) {
		this.atmState = newATMState;
	}
	
	public void setCashInMachine(int newCashInMachine) {
		this.cashInMachine = newCashInMachine;
	}
	
	public void ejectCard() {
		this.atmState.ejectCard();
	}
	
	public void insertCard() {
		this.atmState.insertCard();
	}
	
	public void insertPin(int pinEntered) {
		this.atmState.insertPin(pinEntered);
	}
	
	public void requestCash(int cashToWithdraw) {
		this.atmState.requestCash(cashToWithdraw);
	}
	
	public void depositCash(int cashToDeposit) {
		this.atmState.depositCash(cashToDeposit);
	}
	
	public void checkAccount() {
		this.atmState.checkAccount();
	}
	
	public ATMState getHasCardState() { return this.hasCard; }
	public ATMState getNoCardState() { return this.noCard; }
	public ATMState getHasPin() { return this.hasCorrectPin; }
	public ATMState getNoCashState() { return this.atmOutOfMoney; }
	
	
}
