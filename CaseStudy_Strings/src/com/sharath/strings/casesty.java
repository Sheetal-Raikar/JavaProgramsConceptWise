package com.sharath.strings;

public class casesty {

	public static void main(String[] args) {

		String s = new String("Sheetal");
		String temp = new String();
		for(int i=s.length()-1;i>=0;i--)
		{
			//System.out.print(s.charAt(i));
			temp=temp+s.charAt(i);

		}
		System.out.println(temp);

	}

}
