package com.dzrrcreations.designpatterns.FlyweightDesignPattern.classes;

import java.awt.Color;
import java.awt.Graphics;

public class MyRectangle {

	private Color color;
	//private int x, y, x2, y2;
	
	public MyRectangle(Color color) {
		super();
		this.color = color;
	}
	
	public void draw(Graphics g, int topX, int topY, int bottomX, int bottomY) {
		g.setColor(color);
		g.fillRect(topX, topY, bottomX, bottomY);
	}
	
	//Expensive way:
	/*
	public MyRectangle(Color color, int topX, int topY, int bottomX, int bottomY) {
		super();
		this.color = color;
		this.x = topX;
		this.y = topY;
		this.x2 = bottomX;
		this.y2 = bottomY;
	}
	
	public void draw(Graphics g) {
		g.setColor(color);
		g.fillRect(this.x, this.y, this.x2, this.y2);
	}
	*/
	
	
}
