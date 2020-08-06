package com.odessa.onedarray;

public class This_call {

	public static void main(String[] args) {


		Dog3 d= new Dog3("Pink", "Lab", 2000);
		

		System.out.println(d.getName());
		System.out.println(d.getBreed());
		System.out.println(d.getCost());
		Dog3 d2= new Dog3();		 
		System.out.println(d2.getName());
		System.out.println(d2.getBreed());
		System.out.println(d2.getCost());
		
	}

}
		


class Dog3
{
	private String name;
	private String breed;
	int cost;
	Dog3(String name,String breed,int cost)
	{
		this();
		System.out.println("Before this");	
	/*	this.name=name;
		this.breed=breed;
		this.cost=cost;*/
	}

	String getName()
	{
		return name;
	}
	String getBreed()
	{
		return breed;
	}
	int getCost()
	{
		return cost;
	}
	Dog3()
	{
		System.out.println("After this");
		name="Jolly";
	    breed="Pug";
	    cost=3000;
	    System.out.println("After this");    
	}
}



