package com.dzrrcreations.designpatterns.ObserverDesignPattern.model;

import java.text.DecimalFormat;

public class GetTheStock implements Runnable {
	
	private int startTime;
	private String stock;
	private double price;
	
	private Subject stockGrabber;
	
	public GetTheStock(Subject newStockGrabber, int newStartTime, String newStock, double newPrice) {
		this.stockGrabber = newStockGrabber;
		this.startTime = newStartTime;
		this.stock = newStock;
		this.price = newPrice;
	}

	@Override
	public void run() {
		for(int i = 1; i <= 20; i++) {
			try {
				Thread.sleep(2000);
			} catch(InterruptedException e) {
				System.out.println("Exception caught: " + e);
			}
			double randNum = (Math.random() * (.06)) - .03;
			DecimalFormat df = new DecimalFormat("#.##");
			//String value = df.format(this.price + randNum).replace(",", ".");
			//System.out.println(value);
			price = Double.valueOf(df.format(this.price + randNum).replace(",", "."));
			if(stock == "IBM") ((StockGrabber)stockGrabber).setIbmPrice(price);
			if(stock == "Aapl") ((StockGrabber)stockGrabber).setAaplPrice(price);
			if(stock == "Goog") ((StockGrabber)stockGrabber).setGoogPrice(price);
			System.out.println(stock + ": " + df.format(this.price + randNum).replace(",", ".") + " " + df.format(randNum).replace(",", "."));
			System.out.println("");
		}
	}

	
	
}
