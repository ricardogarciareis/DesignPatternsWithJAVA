package com.dzrrcreations.designpatterns.InterpreterDesignPattern;

public class Cups extends Expression {

	@Override
	public String gallons(double quantity) {
		return Double.toString(quantity/16);
	}

	@Override
	public String quarts(double quantity) {
		return Double.toString(quantity/4);
	}

	@Override
	public String pints(double quantity) {
		return Double.toString(quantity/2);
	}

	@Override
	public String cups(double quantity) {
		return Double.toString(quantity*2);
	}

	@Override
	public String tablespoons(double quantity) {
		return Double.toString(quantity*16);
	}

	@Override
	public String liters(double quantity) {
		return Double.toString(quantity*0.236588237);
	}

	@Override
	public String cubicmeters(double quantity) {
		return Double.toString(quantity*0.000236588237);
	}

}
