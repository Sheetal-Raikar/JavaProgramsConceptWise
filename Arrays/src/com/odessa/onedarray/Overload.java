package com.odessa.onedarray;

public class Overload {

	public static void main(String[] args) {
		
		Addition a = new Addition ();
		System.out.println(a.add(55, 22));
		

	}

}
class Addition
{
	long add(int x,long y)	
	{
		return x+y;
	}
	int add(int x,int y,int z)
	{
		return x+y+z;
	}
}
