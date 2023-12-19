package com.dzrrcreations.designpatterns.MediatorDesignPattern.abstractclasses;

import com.dzrrcreations.designpatterns.MediatorDesignPattern.interfaces.Mediator;

public abstract class Colleague {

	private Mediator mediator;
	private int colleagueCode;
	
	public Colleague(Mediator mediator) {
		super();
		this.mediator = mediator;
		this.mediator.addColleague(this);
	}
	
	public void saleOffer(String stockSymbol, int stockShares) {
		this.mediator.saleOffer(stockShares, stockSymbol, this.colleagueCode);
	}
	
	public void buyOffer(String stockSymbol, int stockShares) {
		this.mediator.buyOffer(stockShares, stockSymbol, this.colleagueCode);
	}

	public void setColleagueCode(int colleagueCode) {
		this.colleagueCode = colleagueCode;
	}
	
	
}
