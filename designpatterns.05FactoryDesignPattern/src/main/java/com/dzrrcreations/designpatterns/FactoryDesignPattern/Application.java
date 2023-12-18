package com.dzrrcreations.designpatterns.FactoryDesignPattern;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dzrrcreations.designpatterns.FactoryDesignPattern.model.EnemyShip;
import com.dzrrcreations.designpatterns.FactoryDesignPattern.model.EnemyShipFactory;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		factoryDesignPatternTeory();
		
		//Without the Factory Pattern
		/*
		EnemyShip theEnemy = null;
		Scanner userInput = new Scanner(System.in);
		String enemyShipOption = "";
		System.out.print("What kind of ship? [U/R] ");
		if(userInput.hasNextLine()) {
			enemyShipOption = userInput.nextLine();
		}
		if(enemyShipOption.equalsIgnoreCase("u")) {
			theEnemy = new UFOEnemyShip();
		} else if(enemyShipOption.equalsIgnoreCase("r")) {
			theEnemy = new RocketEnemyShip();
		}
		doStuffEnemy(theEnemy);
		*/
		
		//With the Factory Pattern
		EnemyShip theEnemy = null;
		EnemyShipFactory enemyShipFactory = new EnemyShipFactory();
		Scanner userInput = new Scanner(System.in);
		System.out.print("What kind of ship? [U/R/B] ");
		if(userInput.hasNextLine()) {
			String typeOfShip = userInput.nextLine();
			theEnemy = enemyShipFactory.makeEnemyShip(typeOfShip);
		}
		if(theEnemy != null) {
			doStuffEnemy(theEnemy);
		} else {
			System.out.println("Choose an option.");
		}
		
	}
	
	public static void doStuffEnemy(EnemyShip anEnemyShip) {
		anEnemyShip.displayEnemyShip();
		anEnemyShip.followHeroShip();
		anEnemyShip.enemyShipShoots();
	}
	
	public static void factoryDesignPatternTeory() {
		StringBuilder sb = new StringBuilder();
		sb.append(drawHLine());
		sb.append("05 - Factory Design Pattern\n");
		sb.append(drawHLine());
		sb.append("When to Use the Factory Pattern?\n");
		sb.append("- When a method returns one of several possible classes that share a common super class:\n");
		sb.append("     - Create a enemy in a game\n");
		sb.append("     - Random number generator picks a number assigned to a specific enemy\n");
		sb.append("     - The factory returns the enemy associated with that number\n");
		sb.append("- The class is chosen at run time\n");
		sb.append("- When you don't know ahead of time what class object you need\n");
		sb.append("- When all of the potential classes are in the same subclass hierarchy\n");
		sb.append("- To centralize class selection code\n");
		sb.append("- When you don't want the user to have to know every subclass\n");
		sb.append("- To encapsulate object creation\n");
		sb.append(drawHLine());
		System.out.println(sb);
	}
	
	private static Object drawHLine() {
		return "--------------------------------------------------------------------------------------------------------------------------\n";
	}

}
