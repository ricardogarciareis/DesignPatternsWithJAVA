package com.dzrrcreations.designpatterns.InterpreterDesignPattern;

public abstract class Expression {

	public abstract String gallons(double quantity);
	public abstract String quarts(double quantity);
	public abstract String pints(double quantity);
	public abstract String cups(double quantity);
	public abstract String tablespoons(double quantity);
	public abstract String liters(double quantity);
	public abstract String cubicmeters(double quantity);
	
}
