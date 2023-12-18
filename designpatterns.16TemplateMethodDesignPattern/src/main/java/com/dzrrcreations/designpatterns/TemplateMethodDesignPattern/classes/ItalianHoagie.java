package com.dzrrcreations.designpatterns.TemplateMethodDesignPattern.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.dzrrcreations.designpatterns.TemplateMethodDesignPattern.abstractclasses.Hoagie;

public class ItalianHoagie extends Hoagie {
	
	String[] meatUsed = { "Salami", "Pepperoni", "Capicola Ham" };
	String[] cheeseUsed = { "Provolone" };
	String[] vegetablesUsed = { "Lettuce", "Tomatoes", "Onions", "Sweet Peppers" };
	String[] condimentsUsed = { "Oil", "Vinegar" };

	@Override
	public void addMeat() {
		System.out.print("Adding the Meat: ");
		List<String> list = new ArrayList<String>(Arrays.asList(meatUsed));
		String collect = list.stream().collect(Collectors.joining(", "));
		System.out.println(collect);
	}

	@Override
	public void addCheese() {
		System.out.print("Adding the Cheese: ");
		List<String> list = new ArrayList<String>(Arrays.asList(cheeseUsed));
		String collect = list.stream().collect(Collectors.joining(", "));
		System.out.println(collect);
	}

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
