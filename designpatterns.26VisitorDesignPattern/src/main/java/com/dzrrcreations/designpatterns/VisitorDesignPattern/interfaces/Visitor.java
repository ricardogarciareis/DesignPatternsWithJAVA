package com.dzrrcreations.designpatterns.VisitorDesignPattern.interfaces;

import com.dzrrcreations.designpatterns.VisitorDesignPattern.classes.Liquor;
import com.dzrrcreations.designpatterns.VisitorDesignPattern.classes.Necessity;
import com.dzrrcreations.designpatterns.VisitorDesignPattern.classes.Tobacco;

public interface Visitor {

	public double visit(Liquor liquorItem);
	public double visit(Tobacco tobaccoItem);
	public double visit(Necessity necessityItem);
	
}
