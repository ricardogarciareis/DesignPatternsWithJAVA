package com.dzrrcreations.designpatterns.InterpreterDesignPattern;

import org.apache.commons.lang3.StringUtils;

public class ConversionContext {

	private String conversionQuestion = "";
	private String conversionResponse = "";
	private String fromConversion = "";
	private String toConversion = "";
	private double quantity;
	
	String[] partsOfQuestion;
	
	public ConversionContext(String input) {
		if(input != null) {
			this.conversionQuestion = input;
			this.partsOfQuestion = getInput().split(" ");
			//Example: 1 gallon to pints (index 0 is 1, index 1 is gallon and index 3 is pints) 
			this.fromConversion = "com.dzrrcreations.designpatterns.InterpreterDesignPattern." + getCapitalized(this.partsOfQuestion[1]);
			this.toConversion = getLowerCase(this.partsOfQuestion[3]);
			this.quantity = Double.valueOf(this.partsOfQuestion[0]);
			this.conversionResponse = this.partsOfQuestion[0] + " " + this.partsOfQuestion[1] + " equals ";
		}
	}
	
	public String getInput() { return this.conversionQuestion; }
	public String getFromConversion() { return this.fromConversion; }
	public String getToConversion() { return this.toConversion; }
	public String getConversionResponse() { return this.conversionResponse; }
	public double getQuantity() { return this.quantity; }
	
	public String getCapitalized(String wordToCapitalize) {
		wordToCapitalize = wordToCapitalize.toLowerCase();
		wordToCapitalize = Character.toUpperCase(wordToCapitalize.charAt(0)) + wordToCapitalize.substring(1);
		if(!StringUtils.right(wordToCapitalize, 1).equals("s"))
			wordToCapitalize = wordToCapitalize + "s";
		return wordToCapitalize;
	}
	
	public String getLowerCase(String wordToLowerCase) { return wordToLowerCase.toLowerCase(); }
}
