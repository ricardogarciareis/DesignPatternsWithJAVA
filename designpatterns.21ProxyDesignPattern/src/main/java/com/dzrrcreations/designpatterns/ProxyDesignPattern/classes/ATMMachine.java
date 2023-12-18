package com.dzrrcreations.designpatterns.ProxyDesignPattern.classes;

import com.dzrrcreations.designpatterns.ProxyDesignPattern.interfaces.ATMState;
import com.dzrrcreations.designpatterns.ProxyDesignPattern.interfaces.GetATMData;

//Context (Account)
public class ATMMachine implements GetATMData {
	
	private ATMState hasCard;
	private ATMState noCard;
	private ATMState hasCorrectPin;
	private ATMState atmOutOfMoney;
	
	private ATMState atmState;
	
	public int cashInMachine = 2000;
	public boolean correctPinEntered = false;
	
	protected ATMMachine() {
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

	
	@Override
	public ATMState getATMData() {
		return this.atmState;
	}

	@Override
	public int getCashInMachine() {
		return this.cashInMachine;
	}
	
	
}
