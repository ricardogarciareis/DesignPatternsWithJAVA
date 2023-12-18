package com.dzrrcreations.designpatterns.ProxyDesignPattern.classes;

import java.util.Scanner;

import com.dzrrcreations.designpatterns.ProxyDesignPattern.interfaces.ATMState;

public class HasPin implements ATMState {
	
	ATMMachine atmMachine;
	Scanner scan;
	
	public HasPin(ATMMachine newATMMachine) {
		this.atmMachine = newATMMachine;
		this.scan = new Scanner(System.in);
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
		this.atmMachine.setATMState(this.atmMachine.getHasPin());
		System.out.println("Already entered PIN.");

	}

	@Override
	public void requestCash(int cashToWithdraw) {
		if(cashToWithdraw > this.atmMachine.cashInMachine) {
			this.atmMachine.setATMState(this.atmMachine.getNoCashState());
			System.out.println("Don't have that cash.");
			answerToEject();
		} else {
			this.atmMachine.setCashInMachine(this.atmMachine.cashInMachine - cashToWithdraw);
			this.atmMachine.setATMState(this.atmMachine.getHasPin());
			System.out.println(cashToWithdraw + " is provided by the machine.");
			if(this.atmMachine.cashInMachine <= 0) {
				this.atmMachine.setATMState(this.atmMachine.getNoCashState());
			}
			answerToEject();
		}
	}
	
	@Override
	public void depositCash(int cashToDeposit) {
		this.atmMachine.setCashInMachine(this.atmMachine.cashInMachine + cashToDeposit);
		this.atmMachine.setATMState(this.atmMachine.getHasPin());
		System.out.println(cashToDeposit + " is deposited in account.");
		answerToEject();
	}
	
	@Override
	public void checkAccount() {
		this.atmMachine.setATMState(this.atmMachine.getHasPin());
		System.out.println("You have " + this.atmMachine.cashInMachine + " in your account.");
		answerToEject();
	}
	
	public void answerToEject() {
		System.out.println("-----------------------------------");
		System.out.print("Do you want to eject your card? [y/n] ");
		String eject = this.scan.next();
		if(eject.equals("y")) {
			ejectCard();
		} else {
			System.out.println("-----------------------------------");
			System.out.println("Available Options:");
			System.out.println("1 - Request Cash");
			System.out.println("2 - Deposit Cash");
			System.out.println("3 - Check Account");
			System.out.println("4 - Eject Card");
			System.out.print("Choose an option: ");
			String option = this.scan.next();
			switch (option) {
                case "1":
                	System.out.print("Desired Cash Request: ");
                	Integer request = this.scan.nextInt();
                	requestCash(request);
                    break;
                case "2":
                	System.out.print("Desired Cash Deposit: ");
                	Integer deposit = this.scan.nextInt();
                	depositCash(deposit);
                    break;
                case "3":
                	checkAccount();
                	break;
                case "4":
                	ejectCard();
                	break;
                default:
                	System.out.println("This option does not exists.");
                	ejectCard();
                	break;
            }
		}
	}
	
	

}
