package com.dzrrcreations.designpatterns.FacadeDesignPattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dzrrcreations.designpatterns.FacadeDesignPattern.classes.BankAccountFacade;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		facadeDesignPatternTeory();
		
		BankAccountFacade accessingBank = new BankAccountFacade("PT50002700000001234567833", 1234);
		accessingBank.withdrawCash(50.00);
		accessingBank.withdrawCash(900.00);
		accessingBank.depositCash(200.00);
		
	}
	
	public static void facadeDesignPatternTeory() {
		StringBuilder sb = new StringBuilder();
		sb.append(drawHLine());
		sb.append("14 - Facade Design Pattern\n");
		sb.append(drawHLine());
		sb.append("What is the Facade Design Pattern?\n");
		sb.append("- When you create a simplified interface that performs many other actions behind the scenes.\n");
		sb.append("- Can I witdrawal 50€ from the bank?\n");
		sb.append("     - Check if the checking account is valid\n");
		sb.append("     - Check if the security code is valid\n");
		sb.append("     - Check if funds are available\n");
		sb.append("     - Make any changes accordingly\n");
		sb.append(drawHLine());
		System.out.println(sb);
	}
	
	private static Object drawHLine() {
		return "-".repeat(120) + "\n";
	}

}
