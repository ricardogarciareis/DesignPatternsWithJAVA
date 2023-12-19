package com.dzrrcreations.designpatterns.MediatorDesignPattern.interfaces;

import com.dzrrcreations.designpatterns.MediatorDesignPattern.abstractclasses.Colleague;

public interface Mediator {

	public void saleOffer(int stockShares, String stockSymbol, int colleagueCode);
	public void buyOffer(int stockShares, String stockSymbol,  int colleagueCode);
	public void addColleague(Colleague colleague);
	
}
