package com.dzrrcreations.designpatterns.PrototypeDesignPattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dzrrcreations.designpatterns.PrototypeDesignPattern.model.CloneFactory;
import com.dzrrcreations.designpatterns.PrototypeDesignPattern.model.Sheep;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		prototypeDesignPatternTeory();
		
		//Fábrica de animais
		CloneFactory animalMaker = new CloneFactory();
		
		//Animal original
		Sheep sally = new Sheep();
		
		//Animal clonado
		Sheep clonedSheep = (Sheep) animalMaker.getClone(sally);
		
		System.out.println(sally);
		System.out.println("Sally Hashcode: " + System.identityHashCode(sally));
		System.out.println(clonedSheep);
		System.out.println("Cloned Sheep Hashcode: " + System.identityHashCode(clonedSheep));
		
	}
	
	public static void prototypeDesignPatternTeory() {
		StringBuilder sb = new StringBuilder();
		sb.append(drawHLine());
		sb.append("09 - Prototype Design Pattern\n");
		sb.append(drawHLine());
		sb.append("What is the Prototype Pattern?\n");
		sb.append("- Creating new objects (instances) by cloning (copying) other objects\n");
		sb.append("- Allows for adding of any subclass instance of a known super class at run time\n");
		sb.append("- When there are numerous potential classes that you want to only use if needed at runtime\n");
		sb.append("- Reduces the need for creating subclasses\n");
		sb.append(drawHLine());
		System.out.println(sb);
	}
	
	private static Object drawHLine() {
		return "--------------------------------------------------------------------------------------------------------------------------\n";
	}

}
