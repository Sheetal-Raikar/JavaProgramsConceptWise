package com.odessa.onedarray;

import java.util.Scanner;

public class String_ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter city name");
		String s = sc.nextLine().toLowerCase().trim();  // usage of toLowerCase and trim 
		if(s.equals("bangalore"))
		{
			System.out.println("hey kannadiga");
		}
		else if (s.equals("hyderabad"))
		{
			System.out.println("hey hyderabad");
		}
		else if(s.equals("Chennai"))
		{
			System.out.println("hey madrasi");
		}
		else
		{
			System.out.println("please enter proper city name");
		}
	}

}
