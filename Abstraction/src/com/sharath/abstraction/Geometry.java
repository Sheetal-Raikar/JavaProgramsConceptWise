package com.sharath.abstraction;

public class Geometry {

public void acceptInputObject(Shape ref)
{
	ref.acceptInput();
	ref.compute();
	ref.disp();
	}

}
