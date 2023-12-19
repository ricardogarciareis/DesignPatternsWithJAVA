package com.dzrrcreations.designpatterns.InterpreterDesignPattern;

public class Liters extends Expression {

	@Override
	public String gallons(double quantity) {
		return Double.toString(quantity/3.785411789132031);
	}

	@Override
	public String quarts(double quantity) {
		return Double.toString(quantity*1.05668821);
	}

	@Override
	public String pints(double quantity) {
		return Double.toString(quantity*2.11337642);
	}

	@Override
	public String cups(double quantity) {
		return Double.toString(quantity*4.22675284);
	}

	@Override
	public String tablespoons(double quantity) {
		return Double.toString(quantity*67.6280454);
	}

	@Override
	public String liters(double quantity) {
		return Double.toString(quantity);
	}

	@Override
	public String cubicmeters(double quantity) {
		return Double.toString(quantity*0.001);
	}

}
