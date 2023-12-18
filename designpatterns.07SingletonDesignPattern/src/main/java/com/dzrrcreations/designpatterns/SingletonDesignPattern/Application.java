package com.dzrrcreations.designpatterns.SingletonDesignPattern;

import java.util.LinkedList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dzrrcreations.designpatterns.SingletonDesignPattern.model.Singleton;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		singletonDesignPatternTeory();
		
		//Scrabble test:
		Singleton newInstance = Singleton.getInstance();
		System.out.println("Instance 1 ID: " + System.identityHashCode(newInstance));
		System.out.println("Available letters: " + newInstance.getLetterList());
		LinkedList<String> playerOneTiles = newInstance.getTiles(7);
		System.out.println("Player 1: " + playerOneTiles);
		System.out.println("Available letters: " + newInstance.getLetterList());
		
		Singleton instance2 = Singleton.getInstance();
		System.out.println("Instance 2 ID: " + System.identityHashCode(instance2));
		System.out.println("Available letters: " + newInstance.getLetterList());
		LinkedList<String> playerTwoTiles = newInstance.getTiles(7);
		System.out.println("Player 2: " + playerTwoTiles);
	}
	
	public static void singletonDesignPatternTeory() {
		StringBuilder sb = new StringBuilder();
		sb.append(drawHLine());
		sb.append("07 - Singleton Design Pattern\n");
		sb.append(drawHLine());
		sb.append("What is the Singleton Pattern?\n");
		sb.append("- It is used when you want to eliminate the option of instantiating more than one object.\n");
		sb.append("- I'll demonstrate it using a class that holds all the potential Scrabble letters and spits out new ones upon request:\n");
		sb.append("     - Each player will share the same potential letter list\n");
		sb.append("     - Each player has their own set of letters\n");
		sb.append(drawHLine());
		System.out.println(sb);
	}
	
	private static Object drawHLine() {
		return "--------------------------------------------------------------------------------------------------------------------------\n";
	}

}
