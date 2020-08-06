package com.odessa.onedarray;

public class Shadow {

	public static void main(String[] args) {
		
Dog d= new Dog();
d.setData("Pink", "Lab", 2000);

System.out.println(d.getName());
System.out.println(d.getBreed());
System.out.println(d.getCost());

	}
}
class Dog
{
	private String name;
	private String breed;
	int cost;
	void setData(String name,String breed,int cost)
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
