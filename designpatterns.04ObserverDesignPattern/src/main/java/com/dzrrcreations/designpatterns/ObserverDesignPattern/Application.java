package com.dzrrcreations.designpatterns.ObserverDesignPattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dzrrcreations.designpatterns.ObserverDesignPattern.model.GetTheStock;
import com.dzrrcreations.designpatterns.ObserverDesignPattern.model.StockGrabber;
import com.dzrrcreations.designpatterns.ObserverDesignPattern.model.StockObserver;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		observerDesignPatternTeory();
		
		StockGrabber stockGrabber = new StockGrabber();
		StockObserver observer1 = new StockObserver(stockGrabber);
		
		stockGrabber.setIbmPrice(197.00);
		stockGrabber.setAaplPrice(677.60);
		stockGrabber.setGoogPrice(676.40);
		StockObserver observer2 = new StockObserver(stockGrabber);
		stockGrabber.setIbmPrice(197.01);
		stockGrabber.setAaplPrice(677.61);
		stockGrabber.setGoogPrice(676.41);
		stockGrabber.unregister(observer1);
		stockGrabber.setIbmPrice(197.02);
		stockGrabber.setAaplPrice(677.62);
		stockGrabber.setGoogPrice(676.42);
		
		
		//With threads:
		/*
		Runnable getIBM = new GetTheStock(stockGrabber, 2, "IBM", 197.00);
		Runnable getAapl = new GetTheStock(stockGrabber, 2, "Aapl", 677.60);
		Runnable getGoog = new GetTheStock(stockGrabber, 2, "Goog", 676.40);
		
		new Thread(getIBM).start();
		new Thread(getAapl).start();
		new Thread(getGoog).start();
		*/
	}
	
	public static void observerDesignPatternTeory() {
		StringBuilder sb = new StringBuilder();
		sb.append(drawHLine());
		sb.append("04 - Observer Design Pattern\n");
		sb.append(drawHLine());
		sb.append("When to Use the Observer Pattern?\n");
		sb.append("- When you need many other objects to receive an update when another object changes:\n");
		sb.append("     - Stock market with thousands of stocks needs to send updates to objects representing individuals stocks\n");
		sb.append("     - The Subject (publisher) sends many stocks to the Observers\n");
		sb.append("     - The Observers (subscribers) takes the ones they want and use them\n");
		sb.append("- Loose coupling is a benefit:\n");
		sb.append("     - The Subject (publisher) doesn't need to know anything about the Observers (subscribers)\n");
		sb.append("- Negatives: the Subject (publisher) may send updates that don't matter to the Observer (subscriber)\n");
		sb.append(drawHLine());
		System.out.println(sb);
	}
	
	private static Object drawHLine() {
		return "--------------------------------------------------------------------------------------------------------------------------\n";
	}

}
