package com.dzrrcreations.designpatterns.VisitorDesignPattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dzrrcreations.designpatterns.VisitorDesignPattern.classes.Liquor;
import com.dzrrcreations.designpatterns.VisitorDesignPattern.classes.Necessity;
import com.dzrrcreations.designpatterns.VisitorDesignPattern.classes.TaxHolidayVisitor;
import com.dzrrcreations.designpatterns.VisitorDesignPattern.classes.TaxVisitor;
import com.dzrrcreations.designpatterns.VisitorDesignPattern.classes.Tobacco;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		visitorDesignPatternTeory();
		
		TaxVisitor taxCalc = new TaxVisitor();
		TaxHolidayVisitor taxHolidayCalc = new TaxHolidayVisitor();
		
		Necessity milk = new Necessity(3.47);
		Liquor vodka = new Liquor(11.99);
		Tobacco cigars = new Tobacco(19.99);
		
		System.out.println("TAX NORMAL PRICES");
		System.out.println(milk.accept(taxCalc));
		System.out.println(vodka.accept(taxCalc));
		System.out.println(cigars.accept(taxCalc));
		
		System.out.println("\nTAX HOLIDAY PRICES");
		System.out.println(milk.accept(taxHolidayCalc));
		System.out.println(vodka.accept(taxHolidayCalc));
		System.out.println(cigars.accept(taxHolidayCalc));
	}
	
	public static void visitorDesignPatternTeory() {
		StringBuilder sb = new StringBuilder();
		sb.append(drawHLine());
		sb.append("26 - Visitor Design Pattern\n");
		sb.append(drawHLine());
		sb.append("What is the Visitor Design Pattern?\n");
		sb.append("- Allows you to add methods to classes of different types without much altering to those classes.\n");
		sb.append("- You can make completely different methods depending on the class used.\n");
		sb.append("- Allows you to define external classes that can extend other classes without majorly editing them.\n");
		sb.append(drawHLine());
		System.out.println(sb);
	}
	
	private static Object drawHLine() {
		return "-".repeat(120) + "\n";
	}

}
