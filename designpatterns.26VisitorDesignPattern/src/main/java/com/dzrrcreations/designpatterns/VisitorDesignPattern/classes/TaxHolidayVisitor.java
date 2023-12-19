package com.dzrrcreations.designpatterns.VisitorDesignPattern.classes;

import java.text.DecimalFormat;

import com.dzrrcreations.designpatterns.VisitorDesignPattern.interfaces.Visitor;

public class TaxHolidayVisitor implements Visitor {
	
	DecimalFormat df = new DecimalFormat("#.##");
	
	public TaxHolidayVisitor() {
		
	}

	@Override
	public double visit(Liquor liquorItem) {
		System.out.println("Liquor item: Price with Tax");
		String price = df.format(liquorItem.getPrice()*.10 + liquorItem.getPrice()).replace(",", ".");
		return Double.parseDouble(price);
	}

	@Override
	public double visit(Tobacco tobaccoItem) {
		System.out.println("Tobbaco item: Price with Tax");
		String price = df.format(tobaccoItem.getPrice()*.30 + tobaccoItem.getPrice()).replace(",", ".");
		return Double.parseDouble(price);
	}

	@Override
	public double visit(Necessity necessityItem) {
		System.out.println("Necessity  item: Price with Tax");
		String price = df.format(necessityItem.getPrice()*0 + necessityItem.getPrice()).replace(",", ".");
		return Double.parseDouble(price);
	}

}
