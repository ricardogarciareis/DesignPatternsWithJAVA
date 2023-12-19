package com.dzrrcreations.designpatterns.MementoDesignPattern.classes;

public class Memento {

	private String article;

	public Memento(String article) {
		super();
		this.article = article;
	}

	public String getSavedArticle() { return article; }
	
	
}
