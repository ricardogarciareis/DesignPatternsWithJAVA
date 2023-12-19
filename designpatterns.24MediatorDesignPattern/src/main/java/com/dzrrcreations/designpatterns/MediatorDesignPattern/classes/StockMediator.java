package com.dzrrcreations.designpatterns.MediatorDesignPattern.classes;

import java.util.ArrayList;
import java.util.List;

import com.dzrrcreations.designpatterns.MediatorDesignPattern.abstractclasses.Colleague;
import com.dzrrcreations.designpatterns.MediatorDesignPattern.interfaces.Mediator;

public class StockMediator implements Mediator {
	
	private List<Colleague> colleagues;
	private List<StockOffer> stockSellOffers;
	private List<StockOffer> stockBuyOffers;
	
	private int colleagueCodes = 0;
	
	public StockMediator() {
		this.colleagues = new ArrayList<Colleague>();
		this.stockSellOffers = new ArrayList<StockOffer>();
		this.stockBuyOffers = new ArrayList<StockOffer>();
	}
	
	@Override
	public void addColleague(Colleague colleague) {
		this.colleagues.add(colleague);
		this.colleagueCodes++;
		colleague.setColleagueCode(colleagueCodes);
	}

	@Override
	public void saleOffer(int stockShares, String stockSymbol, int colleagueCode) {
		boolean stockSold = false;
		for(StockOffer offer : this.stockBuyOffers) {
			if((offer.getStockSymbol() == stockSymbol) && (offer.getStockShares() == stockShares)) {
				System.out.println(stockShares + " shares of " + stockSymbol + " sold to colleague code " + offer.getColleagueCode());
				this.stockBuyOffers.remove(offer);
				stockSold = true;
			}
			if(stockSold) { break; }
		}
		if(!stockSold) {
			System.out.println(stockShares + " shares of " + stockSymbol + " added to inventory");
			StockOffer newOffering = new StockOffer(stockShares, stockSymbol, colleagueCode);
			this.stockSellOffers.add(newOffering);
		}
	}

	@Override
	public void buyOffer(int stockShares, String stockSymbol,int colleagueCode) {
		boolean stockBought = false;
		for(StockOffer offer : this.stockSellOffers) {
			if((offer.getStockSymbol() == stockSymbol) && (offer.getStockShares() == stockShares)) {
				System.out.println(stockShares + " shares of " + stockSymbol + " bought by colleague code " + offer.getColleagueCode());
				this.stockSellOffers.remove(offer);
				stockBought = true;
			}
			if(stockBought) { break; }
		}
		if(!stockBought) {
			System.out.println(stockShares + " shares of " + stockSymbol + " added to inventory");
			StockOffer newOffering = new StockOffer(stockShares, stockSymbol, colleagueCode);
			this.stockBuyOffers.add(newOffering);
		}
	}

	public void getStockOfferings() {
		System.out.println("\nStocks for Sale");
		this.stockSellOffers.stream()
							.forEach(s -> System.out.println(s.getStockShares() + " of " + s.getStockSymbol()));
		System.out.println("\nStocks Buy Offers");
		this.stockBuyOffers.stream()
							.forEach(b -> System.out.println(b.getStockShares() + " of " + b.getStockSymbol()));
		System.out.println("");
	}

}
