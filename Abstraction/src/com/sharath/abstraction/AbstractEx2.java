package com.sharath.abstraction;

public class AbstractEx2 {

	public static void main(String[] args) {
		Square s = new Square();
		Rectangle r = new Rectangle();
		Circle c = new Circle();
		Geometry g = new Geometry();
		g.acceptInputObject(s);
		g.acceptInputObject(r);
		g.acceptInputObject(c);
	}

}

