package com.odessa.onedarray;

public class encap_constructor {

	public static void main(String[] args) 
	{
		Dog1 d= new Dog1("Pink", "Lab", 2000);
		

		System.out.println(d.getName());
		System.out.println(d.getBreed());
		System.out.println(d.getCost());
	}

}
		


class Dog1
{
	private String name;
	private String breed;
	int cost;
	Dog1(String name,String breed,int cost)
	{
		this.name=name;
		this.breed=breed;
		this.cost=cost;
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
}

