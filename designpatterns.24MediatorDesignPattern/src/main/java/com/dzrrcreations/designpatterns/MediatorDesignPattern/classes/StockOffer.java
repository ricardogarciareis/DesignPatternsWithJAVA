package com.dzrrcreations.designpatterns.MediatorDesignPattern.classes;

public class StockOffer {

	private int stockShares = 0;
	private String stockSymbol = "";
	private int colleagueCode = 0;
	
	public StockOffer(int stockShares, String stockSymbol, int colleagueCode) {
		super();
		this.stockShares = stockShares;
		this.stockSymbol = stockSymbol;
		this.colleagueCode = colleagueCode;
	}

	public int getStockShares() { return this.stockShares; }
	public String getStockSymbol() { return this.stockSymbol; }
	public int getColleagueCode() { return this.colleagueCode; }
	
}
