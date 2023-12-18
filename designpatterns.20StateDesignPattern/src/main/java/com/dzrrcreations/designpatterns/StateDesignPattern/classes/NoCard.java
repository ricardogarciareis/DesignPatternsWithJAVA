package com.dzrrcreations.designpatterns.StateDesignPattern.classes;

import com.dzrrcreations.designpatterns.StateDesignPattern.interfaces.ATMState;

public class NoCard implements ATMState {
	
	ATMMachine atmMachine;
	
	public NoCard(ATMMachine newATMMachine) {
		this.atmMachine = newATMMachine;
	}

	@Override
	public void insertCard() {
		this.atmMachine.setATMState(this.atmMachine.getHasCardState());
		System.out.println("Please enter a PIN: ");
	}

	@Override
	public void ejectCard() {
		this.atmMachine.setATMState(this.atmMachine.getNoCardState());
		System.out.println("Enter a card first.");
	}

	@Override
	public void insertPin(int pinEntered) {
		this.atmMachine.setATMState(this.atmMachine.getNoCardState());
		System.out.println("Enter a card first.");
	}

	@Override
	public void requestCash(int cashToWithdraw) {
		this.atmMachine.setATMState(this.atmMachine.getNoCardState());
		System.out.println("Enter a card first.");
	}
	
	@Override
	public void depositCash(int cashToDeposit) {
		this.atmMachine.setATMState(this.atmMachine.getNoCardState());
		System.out.println("Enter a card first.");
	}
	
	@Override
	public void checkAccount() {
		this.atmMachine.setATMState(this.atmMachine.getNoCardState());
		System.out.println("Enter a card first.");
	}

}
