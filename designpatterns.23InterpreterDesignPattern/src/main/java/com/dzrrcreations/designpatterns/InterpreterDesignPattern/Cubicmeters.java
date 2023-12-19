package com.dzrrcreations.designpatterns.InterpreterDesignPattern;

public class Cubicmeters extends Expression {

	@Override
	public String gallons(double quantity) {
		return Double.toString(quantity*264.172052);
	}

	@Override
	public String quarts(double quantity) {
		return Double.toString(quantity*1056.68821);
	}

	@Override
	public String pints(double quantity) {
		return Double.toString(quantity*2113.37642);
	}

	@Override
	public String cups(double quantity) {
		return Double.toString(quantity*4226.75284);
	}

	@Override
	public String tablespoons(double quantity) {
		return Double.toString(quantity*67628.0454);
	}

	@Override
	public String liters(double quantity) {
		return Double.toString(quantity*1000);
	}

	@Override
	public String cubicmeters(double quantity) {
		return Double.toString(quantity);
	}

}
