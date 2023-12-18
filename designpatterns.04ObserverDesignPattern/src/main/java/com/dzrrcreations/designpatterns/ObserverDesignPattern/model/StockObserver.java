package com.dzrrcreations.designpatterns.ObserverDesignPattern.model;

public class StockObserver implements Observer {
	
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;
	
	private static int observerIDTracker = 0;
	
	private int observerID;
	
	private Subject stockGrabber;
	
	public StockObserver(Subject newStockGrabber) {
		this.stockGrabber = newStockGrabber;
		this.observerID = ++observerIDTracker;
		System.out.println("New Observer " + this.observerID + " created\n");
		newStockGrabber.register(this);
	}

	@Override
	public void update(double newIbmPrice, double newAaplPrice, double newGoogPrice) {
		this.ibmPrice = newIbmPrice;
		this.aaplPrice = newAaplPrice;
		this.googPrice = newGoogPrice;
		printThePrices();
	}
	
	public void printThePrices() {
		System.out.println(this.observerID + "\nIBM: " + this.ibmPrice + "\nAapl: " + this.aaplPrice + "\nGoogle: " + this.googPrice + "\n");
	}

}
