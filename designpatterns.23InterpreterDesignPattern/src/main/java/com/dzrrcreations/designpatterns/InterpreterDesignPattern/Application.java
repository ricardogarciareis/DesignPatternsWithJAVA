package com.dzrrcreations.designpatterns.InterpreterDesignPattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		interpreterDesignPatternTeory();
		
		//Run MeasurementConversion.java
	}
	
	public static void interpreterDesignPatternTeory() {
		StringBuilder sb = new StringBuilder();
		sb.append(drawHLine());
		sb.append("23 - Interpreter Design Pattern\n");
		sb.append(drawHLine());
		sb.append("What is the Interpreter Design Pattern?\n");
		sb.append("- 'The Interpreter pattern is normally ignored'\n");
		sb.append("- 'This pattern is almost never used'\n");
		sb.append("- I find it to be extremely useful if combined with Java Reflection techniques.\n");
		sb.append("- It is used to convert one representation of data into another.\n");
		sb.append("- The Context contains the information that will be interpreted.\n");
		sb.append("- The Expression is an abstract class that defines all the methods needed to perform the different conversions.\n");
		sb.append("- The Terminal or Concrete Expressions provide specific conversions on different types of data.\n");
		sb.append(drawHLine());
		System.out.println(sb);
	}
	
	private static Object drawHLine() {
		return "-".repeat(120) + "\n";
	}

}
