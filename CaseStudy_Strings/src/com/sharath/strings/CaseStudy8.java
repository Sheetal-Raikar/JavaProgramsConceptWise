package com.sharath.strings;

import java.util.Scanner;

public class CaseStudy8 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter the string");
String input=sc.nextLine();
char[] inputArray=input.toCharArray();
for(int i=inputArray.length-1;i>=0;i--)
{
	System.out.print(inputArray[i]);
}
	}

}
