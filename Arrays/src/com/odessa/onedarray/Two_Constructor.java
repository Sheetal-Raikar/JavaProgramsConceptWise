package com.odessa.onedarray;

public class Two_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog2 d= new Dog2("Pink", "Lab", 2000);
		

		System.out.println(d.getName());
		System.out.println(d.getBreed());
		System.out.println(d.getCost());
		Dog2 d2= new Dog2();		 
		System.out.println(d2.getName());
		System.out.println(d2.getBreed());
		System.out.println(d2.getCost());
		
	}

}
		


class Dog2
{
	private String name;
	private String breed;
	int cost;
	Dog2(String name,String breed,int cost)
	{
		this.name=name;
		this.breed=breed;
		this.cost=cost;
	}
	Dog2()
	{
		name="Jolly";
	    breed="Pug";
	    cost=3000;
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


