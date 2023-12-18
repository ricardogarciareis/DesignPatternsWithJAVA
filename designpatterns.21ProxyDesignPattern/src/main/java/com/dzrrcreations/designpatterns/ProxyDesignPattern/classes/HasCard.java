package com.dzrrcreations.designpatterns.ProxyDesignPattern.classes;

import com.dzrrcreations.designpatterns.ProxyDesignPattern.interfaces.ATMState;

public class HasCard implements ATMState {
	
	private ATMMachine atmMachine;
	
	public HasCard(ATMMachine newATMMachine) {
		this.atmMachine = newATMMachine;
	}

	@Override
	public void insertCard() {
		this.atmMachine.setATMState(this.atmMachine.getHasCardState());
		System.out.println("You can't enter more than one card.");
	}

	@Override
	public void ejectCard() {
		this.atmMachine.setATMState(this.atmMachine.getNoCardState());
		System.out.println("-----------------------------------");
		System.out.println("Card ejected.");
	}

	@Override
	public void insertPin(int pinEntered) {
		if(pinEntered == 1234) {
			this.atmMachine.setATMState(this.atmMachine.getHasPin());
			this.atmMachine.correctPinEntered = true;
			System.out.println("Correct PIN.");
		} else {
			this.atmMachine.setATMState(this.atmMachine.getNoCardState());
			this.atmMachine.correctPinEntered = false;
			System.out.println("Wrong PIN.");
			System.out.println("Card ejected.");
		}
	}

	@Override
	public void requestCash(int cashToWithdraw) {
		this.atmMachine.setATMState(this.atmMachine.getHasCardState());
		System.out.println("Enter PIN first.");
	}
	
	@Override
	public void depositCash(int cashToDeposit) {
		this.atmMachine.setATMState(this.atmMachine.getHasCardState());
		System.out.println("Enter PIN first.");
	}
	
	@Override
	public void checkAccount() {
		this.atmMachine.setATMState(this.atmMachine.getHasCardState());
		System.out.println("Enter PIN first.");
	}
	
	

}
