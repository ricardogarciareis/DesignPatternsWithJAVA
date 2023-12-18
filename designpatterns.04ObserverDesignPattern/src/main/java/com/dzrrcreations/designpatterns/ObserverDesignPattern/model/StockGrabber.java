package com.dzrrcreations.designpatterns.ObserverDesignPattern.model;

import java.util.ArrayList;

public class StockGrabber implements Subject {
	
	private ArrayList<Observer> observers;
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;
	
	public StockGrabber() {
		this.observers = new ArrayList<Observer>();
	}

	@Override
	public void register(Observer newObserver) {
		this.observers.add(newObserver);
	}

	@Override
	public void unregister(Observer deleteObserver) {
		int observerIndex = this.observers.indexOf(deleteObserver);
		this.observers.remove(observerIndex);
		System.out.println("Observer " + (observerIndex + 1) + " deleted.\n");
	}

	@Override
	public void notifyObserver() {
		for(Observer observer : this.observers) {
			observer.update(ibmPrice, aaplPrice, googPrice);
		}
	}
	
	public void setIbmPrice(double newIbmPrice) { 
		this.ibmPrice = newIbmPrice; 
		notifyObserver();
	}
	
	public void setAaplPrice(double newAaplPrice) { 
		this.aaplPrice = newAaplPrice; 
		notifyObserver();
	}
	
	public void setGoogPrice(double newGoogPrice) { 
		this.googPrice = newGoogPrice; 
		notifyObserver();
	}

}
