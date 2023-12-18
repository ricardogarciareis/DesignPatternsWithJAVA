package com.dzrrcreations.designpatterns.FlyweightDesignPattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		flyweightDesignPatternTeory();
		
		//Run FlyweightTest.java as JAVA Application
		
	}
	
	public static void flyweightDesignPatternTeory() {
		StringBuilder sb = new StringBuilder();
		sb.append(drawHLine());
		sb.append("19 - Flyweight Design Pattern\n");
		sb.append(drawHLine());
		sb.append("What is the Flyweight Design Pattern?\n");
		sb.append("- Used when you need to create a large number of similar objects\n");
		sb.append("- To reduce memory usage you share Objects that are similar in some way rather than creating new ones\n");
		sb.append("- Intrinsic State: Color\n");
		sb.append("- Extrinsic State: Size\n");
		sb.append(drawHLine());
		System.out.println(sb);
	}
	
	private static Object drawHLine() {
		return "-".repeat(120) + "\n";
	}

}
