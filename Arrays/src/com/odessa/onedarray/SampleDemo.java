package com.odessa.onedarray;

public class SampleDemo {

	public static void main(String[] args) {
Car c1 = new Car();
c1.model="c30";
System.out.println(c1.getModel());
c1.setName("BMW");
System.out.println(c1.getName());
Car c2=new Car();
c2.setName("benz");
System.out.println(c2.getName());
	}

}
class Car
{
	private String name;
	public String model;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setModel(String model)
	{
		this.model=model;
	}
	public String getModel()
	{
		return model;
	}
}
