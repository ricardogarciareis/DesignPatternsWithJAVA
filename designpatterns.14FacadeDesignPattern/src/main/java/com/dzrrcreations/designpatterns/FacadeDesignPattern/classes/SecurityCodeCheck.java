package com.dzrrcreations.designpatterns.FacadeDesignPattern.classes;

public class SecurityCodeCheck {
	
	private Integer securityCode = 1234;


	public Integer getSecurityCode() { return this.securityCode; }
	
	
	public Boolean isCodeCorrect(Integer securityCodeToCheck) {
		if(securityCodeToCheck.equals(this.securityCode))
			return true;
		else
			return false;
	}
	

}
