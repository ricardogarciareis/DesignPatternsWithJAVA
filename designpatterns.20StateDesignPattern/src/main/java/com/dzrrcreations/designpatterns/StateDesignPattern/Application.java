package com.dzrrcreations.designpatterns.StateDesignPattern;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dzrrcreations.designpatterns.StateDesignPattern.classes.ATMMachine;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		stateDesignPatternTeory();
		
		System.out.println("ATM Machine");
		ATMMachine atmMachine = new ATMMachine();
		atmMachine.insertCard();
		pinRequest(atmMachine);
		
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
	
	
	public static void stateDesignPatternTeory() {
		StringBuilder sb = new StringBuilder();
		sb.append(drawHLine());
		sb.append("20 - State Design Pattern\n");
		sb.append(drawHLine());
		sb.append("What is the State Design Pattern?\n");
		sb.append("- Allows an object to alter its behavior when its internal State changes. The object will appear to change its class.\n");
		sb.append("- Context (Account): Maintain an instance of a Concrete State subclass that defines the current State.\n");
		sb.append("- State: Defines an interface for encapsulating the behavior associated with a particular state of the Context.\n");
		sb.append("- Concrete State: Each subclass implements a behavior associated with a State of Context.\n");
		sb.append(drawHLine());
		sb.append("Think about all possible States for the ATM:\\n");
		sb.append("- HasCard\n");
		sb.append("- NoCard\n");
		sb.append("- HasPin\n");
		sb.append("- NoCash\n");
		sb.append("Think about all of the different ways the user could use an ATM:\n");
		sb.append("- Insert Card\n");
		sb.append("- Eject Card\n");
		sb.append("- Insert Pin\n");
		sb.append("- Request Cash\n");
		sb.append(drawHLine());
		System.out.println(sb);
	}
	
	private static Object drawHLine() {
		return "-".repeat(120) + "\n";
	}

}
