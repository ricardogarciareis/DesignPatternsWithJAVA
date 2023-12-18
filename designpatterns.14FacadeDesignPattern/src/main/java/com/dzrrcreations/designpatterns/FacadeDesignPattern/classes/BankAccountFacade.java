package com.dzrrcreations.designpatterns.FacadeDesignPattern.classes;

public class BankAccountFacade {
	
	private String accountNumber;
	private Integer securityCode;
	
	WelcomeToBank bankWelcome;
	AccountNumberCheck accountNumberChecker;
	SecurityCodeCheck securityCodeChecker;
	FundsCheck fundsChecker;
	

	public BankAccountFacade(String accountNumber, Integer securityCode) {
		this.accountNumber = accountNumber;
		this.securityCode = securityCode;
		
		this.bankWelcome = new WelcomeToBank();
		this.accountNumberChecker = new AccountNumberCheck();
		this.securityCodeChecker = new SecurityCodeCheck();
		this.fundsChecker = new FundsCheck();
	}

	public String getAccountNumber() { return accountNumber; }
	public Integer getSecurityCode() { return securityCode; }
	
	
	public void withdrawCash(Double cashToWithdraw) {
		if(this.accountNumberChecker.accountActive(getAccountNumber()) && 
		   this.securityCodeChecker.isCodeCorrect(getSecurityCode()) && 
		   this.fundsChecker.haveEnoughMoney(cashToWithdraw)
		   ) {
			System.out.println("Transaction Complete\n");
		} else {
			System.out.println("Transaction Failed\n");
		}
	}
	
	
	public void depositCash(Double cashToDeposit) {
		if(this.accountNumberChecker.accountActive(getAccountNumber()) && 
		   this.securityCodeChecker.isCodeCorrect(getSecurityCode())
		   ) {
			this.fundsChecker.makeDeposit(cashToDeposit);
			System.out.println("Transaction Complete\n");
		} else {
			System.out.println("Transaction Failed\n");
		}
	}

}
