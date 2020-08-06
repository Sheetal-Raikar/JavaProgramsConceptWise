package com.odessa.onedarray;
import java.util.*;
public class Farmer_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Farmer f1= new Farmer();
		Farmer f2= new Farmer();
		Farmer f3= new Farmer();
		f1.calculate();
		f2.calculate();
		f3.calculate();

	}

}
class Farmer
{
	private int p;
	private int t;
	static private int r; //because this remains the same throughout all the farmers
	private int si;
	static
	{
		r=3;
	}
	void calculate()
	{
		
		Scanner sc = new Scanner (System.in);
		System.out.println("ënter loan");
		p=sc.nextInt();
		System.out.println("ënter time");
		t=sc.nextInt();
	//	r=3;
		si=(p*t*r)/100;
		System.out.println(si);
				
	}
}
