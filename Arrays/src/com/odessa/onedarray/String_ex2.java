package com.odessa.onedarray;

public class String_ex2 {

	public static void main(String[] args) {
		String s1 = new String("You cannot change me");
		String s2 = new String("You cannot change me");	
		System.out.println(s1==s2); //false
		String s3="You cannot change me";
		System.out.println(s1==s3);  //false
		String s4="You cannot change me";
		System.out.println(s3==s4);  //true
		String s5="You cannot" + " change me";  //one object is created...same as s3 and s4...happens at compile time
		System.out.println(s4==s5);  //true
		String s6="You cannot";
		String s7=s6+ "change me"; // this operation happens at run time since we have one variable s6 and a new object s7 is created in the heap area
		System.out.println(s4==s7);//false
		final String s8="You cannot";
		String s9=s8+ " change me";//this operation is performed at compile time ..same as s5
		System.out.println(s4==s9); //true
		
		
		
	}

}
