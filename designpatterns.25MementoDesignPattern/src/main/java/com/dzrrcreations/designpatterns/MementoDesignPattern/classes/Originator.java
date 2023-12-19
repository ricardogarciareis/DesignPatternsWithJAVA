package com.dzrrcreations.designpatterns.MementoDesignPattern.classes;

public class Originator {

	private String article;

	public void setArticle(String article) {
		System.out.println("From Originator: Current Version of Article\n" + article);
		this.article = article;
	}
	
	public Memento storeInMemento() {
		System.out.println("From Originator: Saving Article to Memento\n");
		return new Memento(this.article);
	}
	
	public String restoreFromMemento(Memento memento) {
		this.article = memento.getSavedArticle();
		System.out.println("From Originator: Previous Article Saved in Memento\n" + this.article);
		return this.article;
	}
	
}
