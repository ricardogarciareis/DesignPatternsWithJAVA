package com.dzrrcreations.designpatterns.FacadeDesignPattern.classes;

public class AccountNumberCheck {
	
	private String accountNumber = "PT50002700000001234567833";


	public String getAccountNumber() { return this.accountNumber; }
	
	
	public Boolean accountActive(String accountNumberToCheck) {
		if(accountNumberToCheck.equals(getAccountNumber()))
			return true;
		else
			return false;
	}
	
	

}
