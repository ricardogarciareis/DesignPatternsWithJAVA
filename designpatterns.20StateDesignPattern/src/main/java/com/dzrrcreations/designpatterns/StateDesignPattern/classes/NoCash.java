package com.dzrrcreations.designpatterns.StateDesignPattern.classes;

import java.util.Scanner;

import com.dzrrcreations.designpatterns.StateDesignPattern.interfaces.ATMState;

public class NoCash implements ATMState {

	ATMMachine atmMachine;
	Scanner scan;
	
	public NoCash(ATMMachine newATMMachine) {
		this.atmMachine = newATMMachine;
		this.scan = new Scanner(System.in);
	}
	
	@Override
	public void insertCard() {
		this.atmMachine.setATMState(this.atmMachine.getNoCashState());
		System.out.println("Enter a PIN.");
	}

	@Override
	public void ejectCard() {
		this.atmMachine.setATMState(this.atmMachine.getNoCardState());
		System.out.println("-----------------------------------");
		System.out.println("Card ejected.");
	}

	@Override
	public void insertPin(int pinEntered) {
		this.atmMachine.setATMState(this.atmMachine.getNoCashState());
		System.out.println("Don't have any cash.");
		answerToEject();
	}

	@Override
	public void requestCash(int cashToWithdraw) {
		this.atmMachine.setATMState(this.atmMachine.getNoCashState());
		System.out.println("Don't have any cash.");
		answerToEject();
	}
	
	@Override
	public void depositCash(int cashToDeposit) {
		this.atmMachine.setCashInMachine(this.atmMachine.cashInMachine + cashToDeposit);
		this.atmMachine.setATMState(this.atmMachine.getNoCashState());
		System.out.println(cashToDeposit + " is deposited in account.");
		answerToEject();
	}
	
	@Override
	public void checkAccount() {
		this.atmMachine.setATMState(this.atmMachine.getNoCashState());
		System.out.println("You have " + this.atmMachine.cashInMachine + " in your account.");
		answerToEject();
	}
	
	public void answerToEject() {
		System.out.print("Do you want to eject your card? [y/n] ");
		String answer = this.scan.nextLine();
		if(answer.equals("y")) {
			ejectCard();
		} else {
			System.out.println("Choose an option.");
		}
	}

}
