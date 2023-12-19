package com.dzrrcreations.designpatterns.InterpreterDesignPattern;

public class Tablespoons extends Expression {

	@Override
	public String gallons(double quantity) {
		return Double.toString(quantity/256);
	}

	@Override
	public String quarts(double quantity) {
		return Double.toString(quantity/64);
	}

	@Override
	public String pints(double quantity) {
		return Double.toString(quantity/32);
	}

	@Override
	public String cups(double quantity) {
		return Double.toString(quantity/16);
	}

	@Override
	public String tablespoons(double quantity) {
		return Double.toString(quantity);
	}

	@Override
	public String liters(double quantity) {
		return Double.toString(quantity*0.0147867648);
	}

	@Override
	public String cubicmeters(double quantity) {
		return Double.toString(quantity*0.0000147867648);
	}

}
