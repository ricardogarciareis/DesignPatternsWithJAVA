package com.dzrrcreations.designpatterns.InterpreterDesignPattern;

public class Quarts extends Expression {

	@Override
	public String gallons(double quantity) {
		return Double.toString(quantity/4);
	}

	@Override
	public String quarts(double quantity) {
		return Double.toString(quantity);
	}

	@Override
	public String pints(double quantity) {
		return Double.toString(quantity*2);
	}

	@Override
	public String cups(double quantity) {
		return Double.toString(quantity*4);
	}

	@Override
	public String tablespoons(double quantity) {
		return Double.toString(quantity*64);
	}

	@Override
	public String liters(double quantity) {
		return Double.toString(quantity*0.946352946);
	}

	@Override
	public String cubicmeters(double quantity) {
		return Double.toString(quantity*0.000946352946);
	}

}
