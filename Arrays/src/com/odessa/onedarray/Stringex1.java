package com.odessa.onedarray;

public class Stringex1 {

	public static void main(String[] args) {
		Test11 t= new Test11();
		System.out.println("hello" + t);  // call for toString() happens internally where reference is tried to print

	}

}
class Test11
{
//tryin to override toString() of Object's toString()
	public String toString()
	{
		return "ley";
	}
}
