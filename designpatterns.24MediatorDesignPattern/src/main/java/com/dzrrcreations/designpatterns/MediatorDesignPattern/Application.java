package com.dzrrcreations.designpatterns.MediatorDesignPattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dzrrcreations.designpatterns.MediatorDesignPattern.classes.GormanSlacks;
import com.dzrrcreations.designpatterns.MediatorDesignPattern.classes.JTPoorman;
import com.dzrrcreations.designpatterns.MediatorDesignPattern.classes.StockMediator;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		mediatorDesignPatternTeory();
		
		StockMediator nyse = new StockMediator();
		GormanSlacks broker001 = new GormanSlacks(nyse);
		JTPoorman broker002 = new JTPoorman(nyse);
		
		broker001.saleOffer("MSFT", 100);
		broker001.saleOffer("GOOG", 50);
		
		broker002.buyOffer("MSFT", 100);
		broker002.saleOffer("NRG", 10);
		
		broker001.buyOffer("NRG", 5);
		
		nyse.getStockOfferings();
	}
	
	public static void mediatorDesignPatternTeory() {
		StringBuilder sb = new StringBuilder();
		sb.append(drawHLine());
		sb.append("24 - Mediator Design Pattern\n");
		sb.append(drawHLine());
		sb.append("What is the Mediator Design Pattern?\n");
		sb.append("- It is used to handle communication between related objects (Colleagues).\n");
		sb.append("- All communication is handled by the Mediator and the Colleagues don't need to know anything about each other.\n");
		sb.append("- Allows loose coupling by encapsulating the way disparate sets of objects interact and communicate with each other.\n");
		sb.append("  Allows for the actions of each object set to vary independently of one another.\n");
		sb.append(drawHLine());
		System.out.println(sb);
	}
	
	private static Object drawHLine() {
		return "-".repeat(120) + "\n";
	}

}
