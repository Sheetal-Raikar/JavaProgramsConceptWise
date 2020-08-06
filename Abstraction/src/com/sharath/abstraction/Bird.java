package com.sharath.abstraction;
//								Bird
//				Eagle							Sparrow
//	GoldenEagle			SerpantEagle	VegSparrow		NonVegSparrow	

//Bird class is a abstract class
//Eagle class and Sparrow class extends Bird class .hence should implement the abstract methods present in Bird class
//the abstract methods are fly and eat...so these should either be implemented in Eagle or Sparrow or in their(Eagle and Sparrow)
//extended classes i.e GoldenEagle SerpantEagle VegSparrow NonVegSparrow...as these 4 classes extend Eagle and Sparrow abstract classes 
//respectively

public abstract class Bird {
	public abstract void fly(); 
	public abstract void eat();
//	public abstract void flies();
//	public void eat()
//	{
//		System.out.println("Bird eats");
//	}

}
