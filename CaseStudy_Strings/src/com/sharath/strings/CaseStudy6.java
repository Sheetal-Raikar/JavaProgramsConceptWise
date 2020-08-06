//i/p this is a test string
//o/p string test a is this
package com.sharath.strings;

import java.util.Scanner;

public class CaseStudy6 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter the string");
String input=sc.nextLine();
String[] input1=input.split(" ");
for(int i=input1.length-1;i>=0;i--)
{
	System.out.print(input1[i]);
	System.out.print(" ");
}
	}

}
