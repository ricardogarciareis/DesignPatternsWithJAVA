package com.dzrrcreations.designpatterns.VisitorDesignPattern.classes;

import com.dzrrcreations.designpatterns.VisitorDesignPattern.interfaces.Visitable;
import com.dzrrcreations.designpatterns.VisitorDesignPattern.interfaces.Visitor;

public class Liquor implements Visitable {
	
	private double price;

	public Liquor(double price) {
		super();
		this.price = price;
	}

	@Override
	public double accept(Visitor visitor) { return visitor.visit(this); }

	public double getPrice() { return price; }

}
