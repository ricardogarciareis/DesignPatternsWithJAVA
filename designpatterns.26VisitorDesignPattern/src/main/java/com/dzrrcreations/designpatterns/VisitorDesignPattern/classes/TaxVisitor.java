package com.dzrrcreations.designpatterns.VisitorDesignPattern.classes;

import java.text.DecimalFormat;

import com.dzrrcreations.designpatterns.VisitorDesignPattern.interfaces.Visitor;

public class TaxVisitor implements Visitor {
	
	DecimalFormat df = new DecimalFormat("#.##");
	
	public TaxVisitor() {
		
	}

	@Override
	public double visit(Liquor liquorItem) {
		System.out.println("Liquor item: Price with Tax");
		String price = df.format(liquorItem.getPrice()*.18 + liquorItem.getPrice()).replace(",", ".");
		return Double.parseDouble(price);
	}

	@Override
	public double visit(Tobacco tobaccoItem) {
		System.out.println("Tobbaco item: Price with Tax");
		String price = df.format(tobaccoItem.getPrice()*.32 + tobaccoItem.getPrice()).replace(",", ".");
		return Double.parseDouble(price);
	}

	@Override
	public double visit(Necessity necessityItem) {
		System.out.println("Necessity  item: Price with Tax");
		String price = df.format(necessityItem.getPrice()*0 + necessityItem.getPrice()).replace(",", ".");
		return Double.parseDouble(price);
	}

}
