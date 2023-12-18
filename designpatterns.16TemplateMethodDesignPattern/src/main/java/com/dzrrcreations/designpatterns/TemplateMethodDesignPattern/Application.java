package com.dzrrcreations.designpatterns.TemplateMethodDesignPattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dzrrcreations.designpatterns.TemplateMethodDesignPattern.abstractclasses.Hoagie;
import com.dzrrcreations.designpatterns.TemplateMethodDesignPattern.classes.ItalianHoagie;
import com.dzrrcreations.designpatterns.TemplateMethodDesignPattern.classes.VeggieHoagie;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		templateMethodDesignPatternTeory();
		
		Hoagie cust12Hoagie = new ItalianHoagie();
		cust12Hoagie.makeSandwich();
		
		System.out.println(drawHLine());
		
		Hoagie cust13Hoagie = new VeggieHoagie();
		cust13Hoagie .makeSandwich();
	}
	
	public static void templateMethodDesignPatternTeory() {
		StringBuilder sb = new StringBuilder();
		sb.append(drawHLine());
		sb.append("16 - Template Method Design Pattern\n");
		sb.append(drawHLine());
		sb.append("What is the Template Method Design Pattern?\n");
		sb.append("- Used to create a group of subclasses that have to execute a similar group of methods\n");
		sb.append("- You create an abstract class that contains a method called the Template Method\n");
		sb.append("- The Template Method contains a series of method calls that every subclass object will call\n");
		sb.append("- The subclass objects can override some of the method calls\n");
		sb.append(drawHLine());
		System.out.println(sb);
	}
	
	private static Object drawHLine() {
		return "-".repeat(120) + "\n";
	}

}
