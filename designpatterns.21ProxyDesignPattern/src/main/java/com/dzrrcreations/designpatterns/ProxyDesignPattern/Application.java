package com.dzrrcreations.designpatterns.ProxyDesignPattern;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dzrrcreations.designpatterns.ProxyDesignPattern.classes.ATMMachine;
import com.dzrrcreations.designpatterns.ProxyDesignPattern.classes.ATMProxy;
import com.dzrrcreations.designpatterns.ProxyDesignPattern.interfaces.GetATMData;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		proxyDesignPatternTeory();
		
		System.out.println("ATM Machine");
		//ATMMachine atmMachine = new ATMMachine();
		//atmMachine.insertCard();
		//pinRequest(atmMachine);
		
		//GetATMData realATMMachine = new ATMMachine();
		GetATMData atmProxy = new ATMProxy();
		System.out.println("Current ATM State: " + atmProxy.getATMData());
		System.out.println("Cash in ATM Machine: " + atmProxy.getCashInMachine());

	}
	
	public static void pinRequest(ATMMachine atmMachine) {
		Scanner scan = new Scanner(System.in);
		Integer pin = scan.nextInt();
		atmMachine.insertPin(pin);
		showOptions(atmMachine);
		scan.close();
	}
	
	public static void showOptions(ATMMachine atmMachine) {
		Scanner scan = new Scanner(System.in);
		System.out.println("-----------------------------------");
		System.out.println("Available Options:");
		System.out.println("1 - Request Cash");
		System.out.println("2 - Deposit Cash");
		System.out.println("3 - Check Account");
		System.out.println("4 - Eject Card");
		System.out.print("Choose an option: ");
		String option = scan.next();
		switch (option) {
            case "1":
            	System.out.print("Desired Cash Request: ");
            	Integer request = scan.nextInt();
            	atmMachine.requestCash(request);
                break;
            case "2":
            	System.out.print("Desired Cash Deposit: ");
            	Integer deposit = scan.nextInt();
            	atmMachine.depositCash(deposit);
                break;
            case "3":
            	atmMachine.checkAccount();
            	break;
            case "4":
            	atmMachine.ejectCard();
            	break;
            default:
            	System.out.println("This option does not exists.");
            	atmMachine.ejectCard();
            	break;
        }
		scan.close();
	}
	
	public static void proxyDesignPatternTeory() {
		StringBuilder sb = new StringBuilder();
		sb.append(drawHLine());
		sb.append("21 - Proxy Design Pattern\n");
		sb.append(drawHLine());
		sb.append("What is the Proxy Design Pattern?\n");
		sb.append("- Provide a class which will limit access to another class.\n");
		sb.append("- You may do this for security reasons, because an Object is intensive to create, or is accessed from a remote location.\n");
		sb.append(drawHLine());
		System.out.println(sb);
	}
	
	private static Object drawHLine() {
		return "-".repeat(120) + "\n";
	}

}
