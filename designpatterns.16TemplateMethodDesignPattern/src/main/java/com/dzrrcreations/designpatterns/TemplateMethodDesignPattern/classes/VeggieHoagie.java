package com.dzrrcreations.designpatterns.TemplateMethodDesignPattern.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.dzrrcreations.designpatterns.TemplateMethodDesignPattern.abstractclasses.Hoagie;

public class VeggieHoagie extends Hoagie {
	
	String[] vegetablesUsed = { "Lettuce", "Tomatoes", "Onions", "Sweet Peppers" };
	String[] condimentsUsed = { "Oil", "Vinegar" };

	public boolean customerWantsMeat() { return false; }
	public boolean customerWantsCheese() { return false; }
	
	@Override
	public void addMeat() { }
	@Override
	public void addCheese() { }

	@Override
	public void addVegetables() {
		System.out.print("Adding the Vegetables: ");
		List<String> list = new ArrayList<String>(Arrays.asList(vegetablesUsed));
		String collect = list.stream().collect(Collectors.joining(", "));
		System.out.println(collect);
	}

	@Override
	public void addCondiments() {
		System.out.print("Adding the Condiments: ");
		List<String> list = new ArrayList<String>(Arrays.asList(condimentsUsed));
		String collect = list.stream().collect(Collectors.joining(", "));
		System.out.println(collect);
	}
	

}
