package com.dzrrcreations.designpatterns.StrategyDesignPattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dzrrcreations.designpatterns.StrategyDesignPattern.model.Animal;
import com.dzrrcreations.designpatterns.StrategyDesignPattern.model.Bird;
import com.dzrrcreations.designpatterns.StrategyDesignPattern.model.Dog;
import com.dzrrcreations.designpatterns.StrategyDesignPattern.model.ItFlys;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		strategyDesignPatternTeory();
		
		Animal sparky = new Dog();
		Animal tweety = new Bird();
		
		sparky.setName("Sparky");
		tweety.setName("Tweety");
		
		System.out.println(sparky.getName() + sparky.tryToFly());
		System.out.println(tweety.getName() + tweety.tryToFly());
		
		sparky.setFlyingAbility(new ItFlys());
		System.out.println(sparky.getName() + sparky.tryToFly());
	}
	
	public static void strategyDesignPatternTeory() {
		StringBuilder sb = new StringBuilder();
		sb.append(drawHLine());
		sb.append("03 - Strategy Design Pattern\n");
		sb.append(drawHLine());
		sb.append("When to Use the Strategy Pattern?\n");
		sb.append("- When you want to define a class that will have one behavior that is similar to others behavors in a list:\n");
		sb.append("     - I want the class object to be able to choose from:\n");
		sb.append("          - Not flying\n");
		sb.append("          - Flying with Wings\n");
		sb.append("          - Flying Super Fast\n");
		sb.append("- When you need to use one of several behaviors dynamically.\n");
		sb.append("- Often reduces long lists of conditionals.\n");
		sb.append("- Avoids duplicate code.\n");
		sb.append("- Keeps class changes from forcing other class changes.\n");
		sb.append("- Can hide complicated / secret code from ther user.\n");
		sb.append("- Negative: Increased Number of Objects / Classes.\n");
		sb.append(drawHLine());
		System.out.println(sb);
	}
	
	private static Object drawHLine() {
		return "--------------------------------------------------------------------------------------------------------------------------\n";
	}


}
