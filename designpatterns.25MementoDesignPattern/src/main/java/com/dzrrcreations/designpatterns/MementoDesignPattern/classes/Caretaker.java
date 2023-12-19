package com.dzrrcreations.designpatterns.MementoDesignPattern.classes;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

	List<Memento> savedArticles = new ArrayList<Memento>();
	
	public void addMemento(Memento memento) { this.savedArticles.add(memento); }
	
	public Memento getMemento(int index) { return this.savedArticles.get(index); }
}
