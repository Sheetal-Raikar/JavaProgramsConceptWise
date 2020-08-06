package com.sharath.abstraction;

public class AbstractEx3 {

	public static void main(String[] args) {
GoldenEagle ge = new GoldenEagle();
SerpantEagle se = new SerpantEagle();
VegSparrow vs = new VegSparrow();
NonVegSparrow ns = new NonVegSparrow();
Flora f = new Flora();
f.inputBird(ge);;
f.inputBird(se);
f.inputBird(vs);
f.inputBird(ns);
	}

}
