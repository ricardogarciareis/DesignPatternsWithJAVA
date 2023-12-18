package com.dzrrcreations.designpatterns.ObserverDesignPattern.model;

public interface Subject {

	public void register(Observer o);
	public void unregister(Observer o);
	public void notifyObserver();
	
}
