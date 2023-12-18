package com.dzrrcreations.designpatterns.FlyweightDesignPattern.classes;

import java.awt.Color;
import java.util.HashMap;

public class RectangleFactory {

	private static final HashMap<Color, MyRectangle> rectangleByColor = new HashMap<Color, MyRectangle>();
	
	public static MyRectangle getRectangle(Color color) {
		MyRectangle rectangle = (MyRectangle) rectangleByColor.get(color);
		if(rectangle == null) {
			rectangle = new MyRectangle(color);
			rectangleByColor.put(color, rectangle);
		}
		return rectangle;
	}
}
