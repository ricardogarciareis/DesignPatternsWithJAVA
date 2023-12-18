package com.dzrrcreations.designpatterns.FacadeDesignPattern.classes;

public class FundsCheck {
	
	private Double cashInAccount = 1000.00;


	public Double getCashInAccount() { return this.cashInAccount; }

	
	public void decreaseCashInAccount(Double cashWithdrawn) {
		this.cashInAccount -= cashWithdrawn;
	}
	
	
	public void increaseCashInAccount(Double cashDeposited) {
		this.cashInAccount += cashDeposited;
	}
	
	
	public Boolean haveEnoughMoney(Double cashToWithdrawal) {
		if(cashToWithdrawal > this.cashInAccount) {
			System.out.println("Error: You don't have enough money");
			System.out.println("Current Balance: " + this.getCashInAccount());
			return false;
		} else {
			decreaseCashInAccount(cashToWithdrawal);
			System.out.println("Withdrawal Complete. Current Balance: " + this.getCashInAccount());
			return true;
		}	
	}
	
	
	public void makeDeposit(Double cashToDeposit) {
		increaseCashInAccount(cashToDeposit);
		System.out.println("Deposit Complete. Current Balance: " + this.getCashInAccount());
	}

}
