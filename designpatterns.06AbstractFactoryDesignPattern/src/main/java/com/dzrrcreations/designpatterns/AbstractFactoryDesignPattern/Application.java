package com.dzrrcreations.designpatterns.AbstractFactoryDesignPattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dzrrcreations.designpatterns.AbstractFactoryDesignPattern.model.EnemyShip;
import com.dzrrcreations.designpatterns.AbstractFactoryDesignPattern.model.EnemyShipBuilding;
import com.dzrrcreations.designpatterns.AbstractFactoryDesignPattern.model.UFOEnemyShipBuilding;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		abstractFactoryDesignPatternTeory();
		
		//Factory Design Pattern 
		/*
		//Create the factory object
		EnemyShipFactory shipFactory = new EnemyShipFactory();
		
		//Enemy ship object
		EnemyShip theEnemy = null;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("What type of ship? [U/R/B] ");
		if(userInput.hasNextLine()) {
			String typeOfShip = userInput.nextLine().toLowerCase();
			theEnemy = shipFactory.makeEnemyShip(typeOfShip);
			if(theEnemy != null) {
				doStuffEnemy(theEnemy);
			} else {
				System.out.println("Please enter U, R or B next time");
			}
		}*/
		
		//Abstract Factory Design Pattern
		EnemyShipBuilding makeUFOs = new UFOEnemyShipBuilding();
		
		EnemyShip theGrunt = makeUFOs.orderTheShip("UFO");
		System.out.println(theGrunt + "\n");
		
		EnemyShip theBoss = makeUFOs.orderTheShip("UFO BOSS");
		System.out.println(theBoss + "\n");
		
		
	}
	
	public static void doStuffEnemy(EnemyShip anEnemyShip) {
		anEnemyShip.displayEnemyShip();
		anEnemyShip.followHeroShip();
		anEnemyShip.enemyShipShoots();
	}
	
	public static void abstractFactoryDesignPatternTeory() {
		StringBuilder sb = new StringBuilder();
		sb.append(drawHLine());
		sb.append("06 - Abstract Factory Design Pattern\n");
		sb.append(drawHLine());
		sb.append("What is the Abstract Factory Pattern?\n");
		sb.append("- It is like a factory, but everything is encapsulated:\n");
		sb.append("     - The method that orders the object\n");
		sb.append("     - The factories that build the object\n");
		sb.append("     - The final objects\n");
		sb.append("     - The final objects contain objects that use the Strategy Pattern:\n");
		sb.append("          - Composition: Object class fields are objects\n");
		sb.append("When can you do with an Abstract Factory Pattern?\n");
		sb.append("- Allows you to create families of related objects without specifying a concrete class\n");
		sb.append("- Use when you have many objects that can be added, or changed dynamically during runtime\n");
		sb.append("- You can model anything you can imagine and have those objects interact through common interfaces\n");
		sb.append("- The bad: Things can get complicated\n");
		sb.append(drawHLine());
		System.out.println(sb);
	}
	
	private static Object drawHLine() {
		return "--------------------------------------------------------------------------------------------------------------------------\n";
	}

}
