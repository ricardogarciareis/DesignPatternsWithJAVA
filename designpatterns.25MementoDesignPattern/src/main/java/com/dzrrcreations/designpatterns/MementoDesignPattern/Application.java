package com.dzrrcreations.designpatterns.MementoDesignPattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		mementoDesignPatternTeory();
		
		
	}
	
	public static void mementoDesignPatternTeory() {
		StringBuilder sb = new StringBuilder();
		sb.append(drawHLine());
		sb.append("25 - Memento Design Pattern\n");
		sb.append(drawHLine());
		sb.append("What is the Memento Design Pattern?\n");
		sb.append("- A way to store previous states of an Object easily.\n");
		sb.append("- Memento: The basic object that is store in different states.\n");
		sb.append("- Originator: Sets and Gets values from the currently targeted Memento. Creates new Mementos and assigns current values to them.\n");
		sb.append("- Caretaker: Holds an ArrayList that contains all previous versions of the Memento. It can store and retrieve stored Mementos.\n");
		sb.append(drawHLine());
		System.out.println(sb);
	}
	
	private static Object drawHLine() {
		return "-".repeat(120) + "\n";
	}

}
